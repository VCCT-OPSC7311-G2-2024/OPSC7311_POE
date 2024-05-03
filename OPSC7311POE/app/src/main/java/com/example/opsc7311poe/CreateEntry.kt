package com.example.opsc7311poe

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import java.sql.Time
import java.time.LocalDate
import java.time.LocalTime
import java.util.Calendar
import java.util.Date

class CreateEntry : AppCompatActivity() {

    val categoryList = mutableListOf<String>()
    val taskList = mutableListOf<String>()
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_enter_time_sheet)

        val spinCat: Spinner = findViewById(R.id.spinEntryCat)
        val spinTask: Spinner = findViewById(R.id.spinEntryTask)
        val btnSave: Button = findViewById(R.id.btnSaveEntry)
        val tvDate: TextView = findViewById(R.id.tvEntryDate)
        val tvStart: TextView = findViewById(R.id.tvStartTime)
        val tvEnd: TextView = findViewById(R.id.tvEndTime)
        val btnPhoto : TextView = findViewById(R.id.tvUpPhoto)
        val uploaded : ImageView = findViewById(R.id.img_photoUp)

        resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Handle the result if the operation was successful
                val selectedImageUri: Uri? = result.data?.data
                // Now you can use selectedImageUri to access the selected image
                // For example, you might want to display it in an ImageView
                if (selectedImageUri != null) {
                    // Set the selected image to the ImageView
                    uploaded.setImageURI(selectedImageUri)
                } else {
                    Toast.makeText(this@CreateEntry, "Failed to load image", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this@CreateEntry, "Failed to pick image", Toast.LENGTH_SHORT).show()
            }
        }




        // Retrieve user's categories and populate the category list
        SessionUser.currentUser?.categories?.forEach { (name, _) ->
            categoryList.add(name)
        }

        // If there are no categories, disable the task spinner and display "No categories"
        if (categoryList.isEmpty()) {
            spinCat.isEnabled = false
            spinCat.adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                listOf("No categories")
            )

            spinTask.isEnabled = false
            spinTask.adapter =
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listOf("No Tasks"))
            btnSave.isEnabled = false;
        } else {
            // If there are categories, set the spinner to enabled and set its adapter to empty
            spinTask.isEnabled = true
            spinCat.isEnabled = true
            btnSave.isEnabled = true;
            spinTask.adapter =
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, emptyList())
            spinCat.adapter =
                ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, emptyList())
        }

        // Create an adapter for the category Spinner
        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categoryList)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinCat.adapter = categoryAdapter

        //set task spinner to disabled and empty
        spinTask.isEnabled = false
        spinTask.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, emptyList())

        // Set a listener for category selection to update the task Spinner
        spinCat.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Get the selected category name
                val selectedCategoryName = categoryList[position]

                // Create a list to hold task names for the selected category
                taskList.clear() // Clear the existing task list

                // Get the selected category from the user's hashmap
                val selectedCategory =
                    SessionUser.currentUser?.categories?.get(selectedCategoryName)

                // If selectedCategory is not null and it contains tasks, add their names to the list
                if (selectedCategory != null && selectedCategory.tasks.isNotEmpty()) {
                    selectedCategory.tasks.forEach { (taskName, _) ->
                        taskList.add(taskName)
                    }
                }

                // Create an adapter for the task Spinner
                val taskAdapter =
                    ArrayAdapter(this@CreateEntry, android.R.layout.simple_spinner_item, taskList)
                taskAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinTask.adapter = taskAdapter

                // Enable task spinner when a category is selected
                spinTask.isEnabled = true

                // Set the visibility of btnSave based on whether taskList is empty or not
                btnSave.isEnabled = taskList.isNotEmpty()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                spinTask.isEnabled = false
                spinTask.adapter = ArrayAdapter<String>(
                    this@CreateEntry,
                    android.R.layout.simple_spinner_item,
                    emptyList()
                )

                // If nothing is selected, disable btnSave
                btnSave.isEnabled = false
            }
        }

        tvDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

            // Create a date picker dialog
            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDay ->
                    // Update the date TextView with the selected date
                    val selectedDate = LocalDate.of(
                        selectedYear,
                        selectedMonth + 1,
                        selectedDay
                    ) // Month is zero-based
                    tvDate.text = selectedDate.toString()
                },
                year,
                month,
                dayOfMonth
            )

            // Show the date picker dialog
            datePickerDialog.show()
        }

        tvStart.setOnClickListener()
        {
            val calendar = java.util.Calendar.getInstance()
            val hour = calendar.get(java.util.Calendar.HOUR_OF_DAY)
            val minute = calendar.get(java.util.Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { _, selectedHour, selectedMinute ->
                    val selectedTime = LocalTime.of(selectedHour, selectedMinute)
                    tvStart.text = selectedTime.toString()
                },
                hour,
                minute,
                true
            )
            timePickerDialog.show()

        }

        btnPhoto.setOnClickListener()
        {

            selectImage()
        }

        tvEnd.setOnClickListener()
        {
            val calendar = java.util.Calendar.getInstance()
            val hour = calendar.get(java.util.Calendar.HOUR_OF_DAY)
            val minute = calendar.get(java.util.Calendar.MINUTE)

            val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { _, selectedHour, selectedMinute ->
                    val selectedTime = LocalTime.of(selectedHour, selectedMinute)
                    tvEnd.text = selectedTime.toString()
                },
                hour,
                minute,
                true
            )
            timePickerDialog.show()

        }

        btnSave.setOnClickListener()
        {
            // Get the selected task name
            val selectedTaskName = spinTask.selectedItem.toString()

            // Get the selected category name
            val selectedCategoryName = spinCat.selectedItem.toString()

            // Get the selected category from the user's hashmap
            val selectedCategory = SessionUser.currentUser?.categories?.get(selectedCategoryName)

            // If selectedCategory is not null and it contains the selected task
            if (selectedCategory != null && selectedCategory.tasks.containsKey(selectedTaskName)) {
                val selectedTask = selectedCategory.tasks[selectedTaskName]

                // Your code to work with the selected task goes here
                if (selectedTask != null) {
                    // Parse the start and end times
                    val startTime = LocalTime.parse(tvStart.text)
                    val endTime = LocalTime.parse(tvEnd.text)

                    // Calculate the duration
                    val duration = if (startTime.isBefore(endTime)) {
                        val timed = endTime.minusHours(startTime.hour.toLong())
                            .minusMinutes(startTime.minute.toLong())
                            .minusSeconds(startTime.second.toLong())
                        timed.toString()
                    } else {
                        "End time must be after start time"
                    }

                    // Display the duration or error message
                    Toast.makeText(this, "Recording duration: $duration", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Selected task is null", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Selected task or category is null", Toast.LENGTH_SHORT).show()
            }
        }


    }
    private fun selectImage() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        resultLauncher.launch(intent)
    }

}