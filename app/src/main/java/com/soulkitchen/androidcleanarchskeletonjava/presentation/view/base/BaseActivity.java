package com.soulkitchen.androidcleanarchskeletonjava.presentation.view.base;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;
import com.soulkitchen.androidcleanarchskeletonjava.presentation.components.ApplicationComponent;

/**
 * Base Activity class for every Activity in this application.
 */
public class BaseActivity extends AppCompatActivity {


  @Override
  public void setContentView(@LayoutRes int layoutResID) {
    super.setContentView(layoutResID);
    ButterKnife.bind(this);
  }


  /**
   * Adds a {@link Fragment} to this activity's layout.
   *
   * @param containerViewId The container view to where add the fragment.
   * @param fragment The fragment to be added.
   */
  protected void addFragment(@IdRes int containerViewId, Fragment fragment) {
    final FragmentTransaction fragmentTransaction =
        this.getSupportFragmentManager().beginTransaction();
    fragmentTransaction.add(containerViewId, fragment);
    fragmentTransaction.commit();
  }


  /**
   * Get the Main Application component for dependency injection.
   *
   * @return {@link ApplicationComponent} object
   */
  public ApplicationComponent getApplicationComponent() {
    return ((BaseApplication) getApplication()).getApplicationComponent();
  }
}
