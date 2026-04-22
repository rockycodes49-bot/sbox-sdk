plugins {
    id 'com.android.library'
}

android {
    compileSdk 34

    defaultConfig {
        minSdk 21
        targetSdk 34
    }
}

dependencies {
    implementation 'com.squareup.okhttp3:okhttp:4.9.3'
}
