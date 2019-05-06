package com.soulkitchen.androidcleanarchskeletonjava;

import android.os.Bundle;
import com.soulkitchen.androidcleanarchskeletonjava.presentation.view.base.BaseActivity;

public class MainActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
