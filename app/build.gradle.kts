import java.util.regex.Pattern.compile

plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.quizapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.quizapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    testImplementation(libs.junit)
    implementation ("com.android.support:cardview-v7:28.0.0")
    implementation ("com.android.support:design:28.0.0")
    implementation ("com.android.support.constraint:constraint-layout:2.0.4")
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}