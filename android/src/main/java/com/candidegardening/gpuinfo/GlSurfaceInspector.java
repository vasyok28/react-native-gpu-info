package com.candidegardening.gpuinfo;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.widget.FrameLayout;

public class GlSurfaceInspector {
    private GLSurfaceView glView;

    /**
     * Initialise the library and glean GPU information.
     *
     * @param activity the owing activity whose GL Surface is to be inspected.
     */
    public void init(Activity activity) {
        glView = new GLSurfaceView(activity);
        glView.setRenderer(new RNGlRenderer(PreferenceManager.getDefaultSharedPreferences(activity)));
        final FrameLayout rootLayout = activity.findViewById(android.R.id.content);
        rootLayout.addView(glView, 1, 1);
    }

    public void onPause() {
        glView.onPause();
    }

    public void onResume() {
        glView.onResume();
    }
}
