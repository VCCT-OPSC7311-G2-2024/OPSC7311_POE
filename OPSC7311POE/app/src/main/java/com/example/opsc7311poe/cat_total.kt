package com.example.opsc7311poe

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class cat_total : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cat_hours)

        val start: TextView = findViewById(R.id.tvStartDate1)
        val end: TextView = findViewById(R.id.tvEndDate1)
        val select: Button = findViewById(R.id.btnSelectHours)
        val bigTextView: TextView = findViewById(R.id.tv_Total)

        // Date picker dialog for start date
        start.setOnClickListener {
            showDatePicker(start)
        }

        // Date picker dialog for end date
        end.setOnClickListener {
            showDatePicker(end)
        }

        select.setOnClickListener {
            // Get the selected start and end dates
            val startDate = start.text.toString()
            val endDate = end.text.toString()

            //validation
            if (startDate.isEmpty() || endDate.isEmpty()) {
                Toast.makeText(this, "Please select both start and end dates", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Perform search and calculate total hours
            val totalHoursByCategory = calculateTotalHoursByCategory(startDate, endDate)

            // Display total hours by category in the bigTextView
            displayTotalHoursByCategory(totalHoursByCategory)
        }
    }

    private fun showDatePicker(textView: TextView) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, monthOfYear, dayOfMonth ->
                textView.text = "$year-${monthOfYear + 1}-$dayOfMonth"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }

    private fun calculateTotalHoursByCategory(startDate: String, endDate: String): Map<String, Double> {
        val currentUser = SessionUser.currentUser
        val totalHoursByCategory = mutableMapOf<String, Double>()

        currentUser?.categories?.forEach { (_, category) ->
            var totalHours = 0.0
            category.tasks.forEach { (_, task) ->
                task.taskRecords.forEach { recording ->
                    // Check if recording date is within the selected range
                    val recordingDate = recording.RecDate.toString()
                    if (recordingDate >= startDate && recordingDate <= endDate) {
                        // Parse duration string and calculate total hours
                        val duration = recording.Duration
                        val durationHours = parseDurationToHours(duration)
                        totalHours += durationHours
                    }
                }
            }
            totalHoursByCategory[category.name] = totalHours
        }
        return totalHoursByCategory
    }

    // Function to parse duration string to hours
    private fun parseDurationToHours(duration: String): Double {
        val parts = duration.split(":")
        val hours = parts[0].toDouble()
        val minutes = parts[1].toDouble()
        val seconds = parts[2].toDouble()
        // Convert hours, minutes, and seconds to total hours
        return hours + (minutes / 60) + (seconds / 3600)
    }


    private fun displayTotalHoursByCategory(totalHoursByCategory: Map<String, Double>) {
        val bigTextView: TextView = findViewById(R.id.tv_Total)
        var displayText = ""
        totalHoursByCategory.forEach { (categoryName, totalHours) ->
            displayText += "$categoryName: $totalHours hours\n"
        }
        bigTextView.text = displayText
    }
}