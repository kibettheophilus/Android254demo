plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.theo.android254demo"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.theo.android254demo"
        minSdk = 24
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
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

    flavorDimensions += "com"
    productFlavors {
        create("Android254") {
            dimension = "com"
            applicationIdSuffix = ".android"
            compileSdk = 33
        }
        val KotlinKenya by creating {
            dimension = "com"
            applicationIdSuffix = ".kotlin"
        }
    }

    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("Android254") {
            java {
                srcDirs("src\\Android254\\java")
            }
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.5.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0-alpha01")

    // compose
    implementation("androidx.compose.ui:ui:1.3.0-beta02")
    implementation("androidx.compose.material:material:1.1.0-beta01")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.0-beta01")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.0-beta01")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.1.0-beta01")
    implementation("androidx.compose.material:material-icons-extended:1.1.0-beta01")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
