package com.aura.clock;

import android.view.View; // NEW: Import the View class to access UI flags
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    // Override the method that is called when the window gains or loses focus.
    // This is the best place to set system UI visibility for persistent fullscreen.
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // Get the root view of the window
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE              // Stabilizes the layout during bar toggling
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION  // Content draws behind nav bar
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN       // Content draws behind status bar
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION         // HIDES the navigation bar (buttons)
                    | View.SYSTEM_UI_FLAG_FULLSCREEN              // HIDES the status bar (top bar)
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY        // Critical: Makes the hide persistent
            );
        }
    }
}