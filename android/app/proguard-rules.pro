# Release (R8). Room, WorkManager, OkHttp, Retrofit and kotlinx-serialization ship their own rules;
# these are a safety net for anything that would fail silently at runtime

# WorkManager
-keep class * extends androidx.work.ListenableWorker {
    public <init>(android.content.Context, android.work.WorkerParameters);
}

# Serialized DTOs and entities
-keepclassmembers class com.alessio.forza.data.** {
    *** Companion;
}
-keepclasseswithmembers class com.alessio.forza.data.** {
    kotlinx.serialization.KSerializer serializer(...);
}

-keepattributes SourceFile,LineNumberTable,Signature,*Annotation*
-renamesourcefileattribute SourceFile