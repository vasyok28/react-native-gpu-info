package com.candidegardening.gpuinfo;

import android.app.Activity;
import android.app.Application;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class RNGpuInfoActivityCallbackInterceptor implements Application.ActivityLifecycleCallbacks {
    private GLSurfaceView glView;

    /**
     * Creates an instance of the Open GL surface
     * for later inspection.
     *
     * @param activity The owning activity
     * @param savedInstanceState The owning activity's state.
     */
    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        glView = new GLSurfaceView(activity);
        glView.setRenderer(new RNGlRenderer(PreferenceManager.getDefaultSharedPreferences(activity)));
        final FrameLayout rootLayout = activity.findViewById(android.R.id.content);
        rootLayout.addView(
                glView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT)
        );
    }

    @Override
    public void onActivityStarted(Activity activity) {
        // No-op
    }

    @Override
    public void onActivityResumed(Activity activity) {
        glView.onResume();
    }

    @Override
    public void onActivityPaused(Activity activity) {
        glView.onPause();
    }

    @Override
    public void onActivityStopped(Activity activity) {
        // No-op
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        // No-op
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        // No-op
    }
}
