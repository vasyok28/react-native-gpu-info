package com.candidegardening.gpuinfo;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;

public class GlSurfaceInspector {
    private GLSurfaceView glView;

    /**
     * Initialise the library and glean GPU information.
     *
     * @param activity the owing activity whose GL Surface is to be inspected.
     */
    public void init(Activity activity) {
        glView = new GLSurfaceView(activity)
        glView.setRenderer(new RNGlRenderer(PreferenceManager.getDefaultSharedPreferences(activity)));
        activity.setContentView(glView);
    }

    public void onPause() {
        glView.onPause();
    }

    public void onResume() {
        glView.onResume();
    }
}
