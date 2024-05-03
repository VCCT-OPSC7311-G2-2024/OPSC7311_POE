// Generated by view binder compiler. Do not edit!
package com.example.opsc7311poe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.opsc7311poe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEnterTimeSheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSaveEntry;

  @NonNull
  public final ConstraintLayout clNavBar;

  @NonNull
  public final ImageButton ibCalendar;

  @NonNull
  public final ImageButton ibHome;

  @NonNull
  public final ImageButton ibProfile;

  @NonNull
  public final ImageButton ibTimer;

  @NonNull
  public final ImageView imgPhotoUp;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final ConstraintLayout linearLayout2;

  @NonNull
  public final ConstraintLayout linearLayout4;

  @NonNull
  public final ConstraintLayout linearLayout5;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final Spinner spinEntryCat;

  @NonNull
  public final Spinner spinEntryTask;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvCalendar;

  @NonNull
  public final TextView tvCategorySpinner;

  @NonNull
  public final TextView tvEndTime;

  @NonNull
  public final TextView tvEntryDate;

  @NonNull
  public final TextView tvEntryTime;

  @NonNull
  public final TextView tvHome;

  @NonNull
  public final TextView tvProfile;

  @NonNull
  public final TextView tvStartTime;

  @NonNull
  public final TextView tvTaskSpinner;

  @NonNull
  public final TextView tvTimer;

  @NonNull
  public final TextView tvUpPhoto;

  private ActivityEnterTimeSheetBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnSaveEntry, @NonNull ConstraintLayout clNavBar,
      @NonNull ImageButton ibCalendar, @NonNull ImageButton ibHome, @NonNull ImageButton ibProfile,
      @NonNull ImageButton ibTimer, @NonNull ImageView imgPhotoUp,
      @NonNull ConstraintLayout linearLayout, @NonNull ConstraintLayout linearLayout2,
      @NonNull ConstraintLayout linearLayout4, @NonNull ConstraintLayout linearLayout5,
      @NonNull LinearLayout main, @NonNull Spinner spinEntryCat, @NonNull Spinner spinEntryTask,
      @NonNull TextView textView5, @NonNull TextView tvCalendar,
      @NonNull TextView tvCategorySpinner, @NonNull TextView tvEndTime,
      @NonNull TextView tvEntryDate, @NonNull TextView tvEntryTime, @NonNull TextView tvHome,
      @NonNull TextView tvProfile, @NonNull TextView tvStartTime, @NonNull TextView tvTaskSpinner,
      @NonNull TextView tvTimer, @NonNull TextView tvUpPhoto) {
    this.rootView = rootView;
    this.btnSaveEntry = btnSaveEntry;
    this.clNavBar = clNavBar;
    this.ibCalendar = ibCalendar;
    this.ibHome = ibHome;
    this.ibProfile = ibProfile;
    this.ibTimer = ibTimer;
    this.imgPhotoUp = imgPhotoUp;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.linearLayout4 = linearLayout4;
    this.linearLayout5 = linearLayout5;
    this.main = main;
    this.spinEntryCat = spinEntryCat;
    this.spinEntryTask = spinEntryTask;
    this.textView5 = textView5;
    this.tvCalendar = tvCalendar;
    this.tvCategorySpinner = tvCategorySpinner;
    this.tvEndTime = tvEndTime;
    this.tvEntryDate = tvEntryDate;
    this.tvEntryTime = tvEntryTime;
    this.tvHome = tvHome;
    this.tvProfile = tvProfile;
    this.tvStartTime = tvStartTime;
    this.tvTaskSpinner = tvTaskSpinner;
    this.tvTimer = tvTimer;
    this.tvUpPhoto = tvUpPhoto;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEnterTimeSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEnterTimeSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_enter_time_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEnterTimeSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSaveEntry;
      Button btnSaveEntry = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveEntry == null) {
        break missingId;
      }

      id = R.id.cl_NavBar;
      ConstraintLayout clNavBar = ViewBindings.findChildViewById(rootView, id);
      if (clNavBar == null) {
        break missingId;
      }

      id = R.id.ib_Calendar;
      ImageButton ibCalendar = ViewBindings.findChildViewById(rootView, id);
      if (ibCalendar == null) {
        break missingId;
      }

      id = R.id.ib_Home;
      ImageButton ibHome = ViewBindings.findChildViewById(rootView, id);
      if (ibHome == null) {
        break missingId;
      }

      id = R.id.ib_Profile;
      ImageButton ibProfile = ViewBindings.findChildViewById(rootView, id);
      if (ibProfile == null) {
        break missingId;
      }

      id = R.id.ib_Timer;
      ImageButton ibTimer = ViewBindings.findChildViewById(rootView, id);
      if (ibTimer == null) {
        break missingId;
      }

      id = R.id.img_photoUp;
      ImageView imgPhotoUp = ViewBindings.findChildViewById(rootView, id);
      if (imgPhotoUp == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      ConstraintLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      ConstraintLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      ConstraintLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      ConstraintLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.spinEntryCat;
      Spinner spinEntryCat = ViewBindings.findChildViewById(rootView, id);
      if (spinEntryCat == null) {
        break missingId;
      }

      id = R.id.spinEntryTask;
      Spinner spinEntryTask = ViewBindings.findChildViewById(rootView, id);
      if (spinEntryTask == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tv_calendar;
      TextView tvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (tvCalendar == null) {
        break missingId;
      }

      id = R.id.tvCategorySpinner;
      TextView tvCategorySpinner = ViewBindings.findChildViewById(rootView, id);
      if (tvCategorySpinner == null) {
        break missingId;
      }

      id = R.id.tvEndTime;
      TextView tvEndTime = ViewBindings.findChildViewById(rootView, id);
      if (tvEndTime == null) {
        break missingId;
      }

      id = R.id.tvEntryDate;
      TextView tvEntryDate = ViewBindings.findChildViewById(rootView, id);
      if (tvEntryDate == null) {
        break missingId;
      }

      id = R.id.tvEntryTime;
      TextView tvEntryTime = ViewBindings.findChildViewById(rootView, id);
      if (tvEntryTime == null) {
        break missingId;
      }

      id = R.id.tv_Home;
      TextView tvHome = ViewBindings.findChildViewById(rootView, id);
      if (tvHome == null) {
        break missingId;
      }

      id = R.id.tv_Profile;
      TextView tvProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvProfile == null) {
        break missingId;
      }

      id = R.id.tvStartTime;
      TextView tvStartTime = ViewBindings.findChildViewById(rootView, id);
      if (tvStartTime == null) {
        break missingId;
      }

      id = R.id.tvTaskSpinner;
      TextView tvTaskSpinner = ViewBindings.findChildViewById(rootView, id);
      if (tvTaskSpinner == null) {
        break missingId;
      }

      id = R.id.tv_timer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      id = R.id.tvUpPhoto;
      TextView tvUpPhoto = ViewBindings.findChildViewById(rootView, id);
      if (tvUpPhoto == null) {
        break missingId;
      }

      return new ActivityEnterTimeSheetBinding((LinearLayout) rootView, btnSaveEntry, clNavBar,
          ibCalendar, ibHome, ibProfile, ibTimer, imgPhotoUp, linearLayout, linearLayout2,
          linearLayout4, linearLayout5, main, spinEntryCat, spinEntryTask, textView5, tvCalendar,
          tvCategorySpinner, tvEndTime, tvEntryDate, tvEntryTime, tvHome, tvProfile, tvStartTime,
          tvTaskSpinner, tvTimer, tvUpPhoto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
