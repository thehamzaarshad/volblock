# Volume Block

A tiny Android Accessibility Service that ignores the volume up/down keys while the phone is locked.

## What it does
- Listens for hardware key events through an AccessibilityService.
- If the device is locked (KeyguardManager.isKeyguardLocked), the volume key press is consumed, so the volume does not change.
- When the phone is unlocked, the keys work normally.

## Why it is needed
Stops accidental volume changes from a pocket, a bag, or kids while the phone is locked. Normal apps (and Termux) cannot intercept hardware keys; only an Accessibility Service can.

## Install
1. Download `volblock.apk` from the Releases page.
2. Install it. If Play Protect blocks it, turn off "Scan apps with Play Protect" temporarily.
3. On Android 13+, open App info > menu > "Allow restricted settings".
4. Open the app (it opens Accessibility settings) and turn on **Volume Block**.

## Permissions and privacy
Only the Accessibility Service is used, to filter volume key events. No internet permission, no data collected, no network code.

## Build
Built manually in Termux with aapt2, ecj, dx and apksigner (Java, no Gradle). The release APK is debug-signed.

## Notes
Behaviour may differ on some phones (for example when the screen is fully off, or with aggressive battery savers).
