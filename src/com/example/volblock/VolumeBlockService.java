package com.example.volblock;
import android.accessibilityservice.AccessibilityService;
import android.app.KeyguardManager;
import android.content.Context;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
public class VolumeBlockService extends AccessibilityService {
@Override protected boolean onKeyEvent(KeyEvent e) {
int k = e.getKeyCode();
if (k == KeyEvent.KEYCODE_VOLUME_UP || k == KeyEvent.KEYCODE_VOLUME_DOWN) {
KeyguardManager km = (KeyguardManager) getSystemService(Context.KEYGUARD_SERVICE);
if (km.isKeyguardLocked()) return true;
}
return false;
}
@Override public void onAccessibilityEvent(AccessibilityEvent e) {}
@Override public void onInterrupt() {}
}
