// Generated by view binder compiler. Do not edit!
package com.example.opsc7311poe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

public final class ActivityViewGraphsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

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
  public final ConstraintLayout llCalendar;

  @NonNull
  public final ConstraintLayout llHome;

  @NonNull
  public final ConstraintLayout llProfile;

  @NonNull
  public final ConstraintLayout llTimer;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tvCalendar;

  @NonNull
  public final TextView tvHome;

  @NonNull
  public final TextView tvProfile;

  @NonNull
  public final TextView tvTimer;

  private ActivityViewGraphsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout clNavBar, @NonNull ImageButton ibCalendar,
      @NonNull ImageButton ibHome, @NonNull ImageButton ibProfile, @NonNull ImageButton ibTimer,
      @NonNull ConstraintLayout llCalendar, @NonNull ConstraintLayout llHome,
      @NonNull ConstraintLayout llProfile, @NonNull ConstraintLayout llTimer,
      @NonNull ConstraintLayout main, @NonNull TextView tvCalendar, @NonNull TextView tvHome,
      @NonNull TextView tvProfile, @NonNull TextView tvTimer) {
    this.rootView = rootView;
    this.clNavBar = clNavBar;
    this.ibCalendar = ibCalendar;
    this.ibHome = ibHome;
    this.ibProfile = ibProfile;
    this.ibTimer = ibTimer;
    this.llCalendar = llCalendar;
    this.llHome = llHome;
    this.llProfile = llProfile;
    this.llTimer = llTimer;
    this.main = main;
    this.tvCalendar = tvCalendar;
    this.tvHome = tvHome;
    this.tvProfile = tvProfile;
    this.tvTimer = tvTimer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewGraphsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewGraphsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_graphs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewGraphsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.llCalendar;
      ConstraintLayout llCalendar = ViewBindings.findChildViewById(rootView, id);
      if (llCalendar == null) {
        break missingId;
      }

      id = R.id.llHome;
      ConstraintLayout llHome = ViewBindings.findChildViewById(rootView, id);
      if (llHome == null) {
        break missingId;
      }

      id = R.id.llProfile;
      ConstraintLayout llProfile = ViewBindings.findChildViewById(rootView, id);
      if (llProfile == null) {
        break missingId;
      }

      id = R.id.llTimer;
      ConstraintLayout llTimer = ViewBindings.findChildViewById(rootView, id);
      if (llTimer == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tv_calendar;
      TextView tvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (tvCalendar == null) {
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

      id = R.id.tv_timer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      return new ActivityViewGraphsBinding((ConstraintLayout) rootView, clNavBar, ibCalendar,
          ibHome, ibProfile, ibTimer, llCalendar, llHome, llProfile, llTimer, main, tvCalendar,
          tvHome, tvProfile, tvTimer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
