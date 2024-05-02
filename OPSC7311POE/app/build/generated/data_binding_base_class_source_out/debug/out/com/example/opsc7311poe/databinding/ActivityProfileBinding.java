// Generated by view binder compiler. Do not edit!
package com.example.opsc7311poe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSaveProfile;

  @NonNull
  public final EditText edtEmailEdit;

  @NonNull
  public final EditText edtFullNameEdit;

  @NonNull
  public final EditText edtPasswordEdit;

  @NonNull
  public final EditText edtUserNameEdit;

  @NonNull
  public final View empyViews;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final ImageView imgPhotoUp;

  @NonNull
  public final ImageView imgWhiteBackground;

  @NonNull
  public final ImageView ivGoogle;

  @NonNull
  public final ConstraintLayout linearLayout;

  @NonNull
  public final ConstraintLayout linearLayout2;

  @NonNull
  public final ConstraintLayout linearLayout4;

  @NonNull
  public final ConstraintLayout linearLayout5;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView tvCalendar;

  @NonNull
  public final TextView tvCustomiseProfile;

  @NonNull
  public final TextView tvEditusername;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvFullName;

  @NonNull
  public final TextView tvHome;

  @NonNull
  public final TextView tvNewPhoto;

  @NonNull
  public final TextView tvProfile;

  @NonNull
  public final TextView tvProfilePhoto;

  @NonNull
  public final TextView tvSeePassword;

  @NonNull
  public final TextView tvTimer;

  @NonNull
  public final TextView tvuserProfile;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSaveProfile,
      @NonNull EditText edtEmailEdit, @NonNull EditText edtFullNameEdit,
      @NonNull EditText edtPasswordEdit, @NonNull EditText edtUserNameEdit, @NonNull View empyViews,
      @NonNull ImageView imageView15, @NonNull ImageView imageView16,
      @NonNull ImageView imageView17, @NonNull ImageView imageView18, @NonNull ImageView imgPhotoUp,
      @NonNull ImageView imgWhiteBackground, @NonNull ImageView ivGoogle,
      @NonNull ConstraintLayout linearLayout, @NonNull ConstraintLayout linearLayout2,
      @NonNull ConstraintLayout linearLayout4, @NonNull ConstraintLayout linearLayout5,
      @NonNull ConstraintLayout main, @NonNull TextView tvCalendar,
      @NonNull TextView tvCustomiseProfile, @NonNull TextView tvEditusername,
      @NonNull TextView tvEmail, @NonNull TextView tvFullName, @NonNull TextView tvHome,
      @NonNull TextView tvNewPhoto, @NonNull TextView tvProfile, @NonNull TextView tvProfilePhoto,
      @NonNull TextView tvSeePassword, @NonNull TextView tvTimer, @NonNull TextView tvuserProfile) {
    this.rootView = rootView;
    this.btnSaveProfile = btnSaveProfile;
    this.edtEmailEdit = edtEmailEdit;
    this.edtFullNameEdit = edtFullNameEdit;
    this.edtPasswordEdit = edtPasswordEdit;
    this.edtUserNameEdit = edtUserNameEdit;
    this.empyViews = empyViews;
    this.imageView15 = imageView15;
    this.imageView16 = imageView16;
    this.imageView17 = imageView17;
    this.imageView18 = imageView18;
    this.imgPhotoUp = imgPhotoUp;
    this.imgWhiteBackground = imgWhiteBackground;
    this.ivGoogle = ivGoogle;
    this.linearLayout = linearLayout;
    this.linearLayout2 = linearLayout2;
    this.linearLayout4 = linearLayout4;
    this.linearLayout5 = linearLayout5;
    this.main = main;
    this.tvCalendar = tvCalendar;
    this.tvCustomiseProfile = tvCustomiseProfile;
    this.tvEditusername = tvEditusername;
    this.tvEmail = tvEmail;
    this.tvFullName = tvFullName;
    this.tvHome = tvHome;
    this.tvNewPhoto = tvNewPhoto;
    this.tvProfile = tvProfile;
    this.tvProfilePhoto = tvProfilePhoto;
    this.tvSeePassword = tvSeePassword;
    this.tvTimer = tvTimer;
    this.tvuserProfile = tvuserProfile;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSaveProfile;
      Button btnSaveProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveProfile == null) {
        break missingId;
      }

      id = R.id.edtEmailEdit;
      EditText edtEmailEdit = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailEdit == null) {
        break missingId;
      }

      id = R.id.edtFullNameEdit;
      EditText edtFullNameEdit = ViewBindings.findChildViewById(rootView, id);
      if (edtFullNameEdit == null) {
        break missingId;
      }

      id = R.id.edtPasswordEdit;
      EditText edtPasswordEdit = ViewBindings.findChildViewById(rootView, id);
      if (edtPasswordEdit == null) {
        break missingId;
      }

      id = R.id.edtUserNameEdit;
      EditText edtUserNameEdit = ViewBindings.findChildViewById(rootView, id);
      if (edtUserNameEdit == null) {
        break missingId;
      }

      id = R.id.empyViews;
      View empyViews = ViewBindings.findChildViewById(rootView, id);
      if (empyViews == null) {
        break missingId;
      }

      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = ViewBindings.findChildViewById(rootView, id);
      if (imageView16 == null) {
        break missingId;
      }

      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.img_photoUp;
      ImageView imgPhotoUp = ViewBindings.findChildViewById(rootView, id);
      if (imgPhotoUp == null) {
        break missingId;
      }

      id = R.id.img_whiteBackground;
      ImageView imgWhiteBackground = ViewBindings.findChildViewById(rootView, id);
      if (imgWhiteBackground == null) {
        break missingId;
      }

      id = R.id.iv_Google;
      ImageView ivGoogle = ViewBindings.findChildViewById(rootView, id);
      if (ivGoogle == null) {
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

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.tv_calendar;
      TextView tvCalendar = ViewBindings.findChildViewById(rootView, id);
      if (tvCalendar == null) {
        break missingId;
      }

      id = R.id.tvCustomiseProfile;
      TextView tvCustomiseProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvCustomiseProfile == null) {
        break missingId;
      }

      id = R.id.tvEditusername;
      TextView tvEditusername = ViewBindings.findChildViewById(rootView, id);
      if (tvEditusername == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvFullName;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      id = R.id.tv_Home;
      TextView tvHome = ViewBindings.findChildViewById(rootView, id);
      if (tvHome == null) {
        break missingId;
      }

      id = R.id.tvNewPhoto;
      TextView tvNewPhoto = ViewBindings.findChildViewById(rootView, id);
      if (tvNewPhoto == null) {
        break missingId;
      }

      id = R.id.tv_Profile;
      TextView tvProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvProfile == null) {
        break missingId;
      }

      id = R.id.tvProfilePhoto;
      TextView tvProfilePhoto = ViewBindings.findChildViewById(rootView, id);
      if (tvProfilePhoto == null) {
        break missingId;
      }

      id = R.id.tvSeePassword;
      TextView tvSeePassword = ViewBindings.findChildViewById(rootView, id);
      if (tvSeePassword == null) {
        break missingId;
      }

      id = R.id.tv_timer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      id = R.id.tvuserProfile;
      TextView tvuserProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvuserProfile == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, btnSaveProfile, edtEmailEdit,
          edtFullNameEdit, edtPasswordEdit, edtUserNameEdit, empyViews, imageView15, imageView16,
          imageView17, imageView18, imgPhotoUp, imgWhiteBackground, ivGoogle, linearLayout,
          linearLayout2, linearLayout4, linearLayout5, main, tvCalendar, tvCustomiseProfile,
          tvEditusername, tvEmail, tvFullName, tvHome, tvNewPhoto, tvProfile, tvProfilePhoto,
          tvSeePassword, tvTimer, tvuserProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
