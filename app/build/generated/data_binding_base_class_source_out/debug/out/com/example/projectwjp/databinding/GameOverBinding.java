// Generated by view binder compiler. Do not edit!
package com.example.projectwjp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectwjp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GameOverBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton button2;

  @NonNull
  public final ConstraintLayout gameover;

  @NonNull
  public final TextView resultText;

  private GameOverBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton button2,
      @NonNull ConstraintLayout gameover, @NonNull TextView resultText) {
    this.rootView = rootView;
    this.button2 = button2;
    this.gameover = gameover;
    this.resultText = resultText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GameOverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GameOverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.game_over, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GameOverBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      AppCompatButton button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      ConstraintLayout gameover = (ConstraintLayout) rootView;

      id = R.id.resultText;
      TextView resultText = ViewBindings.findChildViewById(rootView, id);
      if (resultText == null) {
        break missingId;
      }

      return new GameOverBinding((ConstraintLayout) rootView, button2, gameover, resultText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}