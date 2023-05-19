# **Android Quick Start Guide**
This guide will help you quickly set up your Android application using the provided code snippet.

## **Prerequisites**
Before you begin, ensure that you have the following:

- Android Studio installed on your machine.
- Basic knowledge of Android development.
- Access to the necessary libraries and dependencies.

## **Step 1: Create a New Project**
1. Open Android Studio.

2. Click on "Start a new Android Studio project" or go to File > New > New Project.
 
3. Follow the prompts to configure your project settings, such as choosing a project name, package name, and minimum SDK version.
 
4. Click Finish to create the project.
 
## **Step 2: Add Libraries and Dependencies**
1. Copy the "CinnoxVisitorSDK.aar" file to the libs directory in your Android project. If the libs directory doesn't exist, create it in the app module.

2. Open your project's build.gradle file (usually found in the root directory).

3. Add the following code snippet inside the dependencies block :  
   
```kotlin
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.aar'])
}
```

4. Sync your project with the Gradle files by clicking on the "Sync Now" button or selecting File > Sync Project with Gradle Files.

## **Step 3: Update the MainActivity**
1. Open the MainActivity.kt file .

2. Add the serviceId of the MainActivity class with the provided code snippet.
```kotlin
const val serviceId = "xxxx.cinnox.com"
```
3. Init CinnoxVisitorCore  
```kotlin
val core = CinnoxVisitorCore.initialize(this, serviceId)
```

4. Add CinnoxVisitorCoreListener and register it when you need to know initialize end.
```kotlin
 private val mCoreListener: CinnoxVisitorCoreListener = object : CinnoxVisitorCoreListener{
        override fun onInitializationEnd(success: Boolean, throwable: Throwable?) {
            Log.d(TAG, "onInitializationEnd, isSuccess: $success, throwable: $throwable")
        }
    }
 core.registerListener(mCoreListener)
```

## **Step 3: Add CinnoxVisitorWidget in the activity_main.xml**

```kotlin
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.m800.maaiiconnect.mobile.client.CinnoxVisitorWidget
        android:id="@+id/floating_button"
        android:layout_width="72dp"
        android:layout_height="72dp"
        android:gravity="center"
        android:scaleType="fitCenter"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```


## **Conclusion**

Congratulations! You have successfully added and configured the "CinnoxVisitorSDK.aar" library in your Android project. Make sure to refer to the library's documentation for any additional setup or usage instructions.

Note: In some cases, you might need to add additional dependencies or configurations specific to the "CinnoxVisitorSDK.aar" library. Please refer to the library's documentation for any specific requirements.

Remember to refer to the official documentation of any external libraries or services used for further information and instructions.

If you have any questions or need further assistance, feel free to ask!

