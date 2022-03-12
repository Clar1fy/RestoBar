// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.0" apply false
    id("com.android.library") version "7.1.0" apply false
    kotlin("android") version "1.6.10" apply false

    // Firebase
//    id(Dependencies.Firebase.services) version Dependencies.Firebase.servicesVersion apply false

    // Navigation SafeArgs
    id(Dependencies.Navigation.safeArgsPlugin) version Dependencies.Navigation.version apply false

    // Hilt
    id(Dependencies.Hilt.plugin) version Dependencies.Hilt.version apply false

}

