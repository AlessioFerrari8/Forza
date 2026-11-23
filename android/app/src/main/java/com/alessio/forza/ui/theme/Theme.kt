package com.alessio.forza.ui.theme

import android.graphics.Typeface
import android.os.Build
import android.provider.Settings
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import java.time.format.TextStyle

@Immutable
data class ForzaColors(
    val protein: Color,
    val carbs: Color,
    val fat: Color,
    val fibre: Color,
    val water: Color,
    val pr: Color,
    val muted: Color,
    val success: Color,
    val track: Color,
)

private val DarkScheme = darkColorScheme(
    primary = Color(0xFFFF6B2C), onPrimary = Color(0XFF1A0A00),
    primaryContainer = Color(0xFF3A1A0A), onPrimaryContainer = Color(0xFFFFD9C7),
    secondary = Color(0xFFEDEBE4), onSecondary = Color(0xFF0F0F0D),
    secondaryContainer = Color(0xFF2A2B26), onSecondaryContainer = Color(0xFFEDEBE4),
    tertiary = Color(0xFFFFD25A), onTertiary = Color(0xFF241A00),
    background = Color(0xFF0F0F0D), onBackground = Color(0xFFEDEBE4),
    surface = Color(0xFF0F0F0D), onSurface = Color(0xFFEDEBE4),
    surfaceVariant = Color(0xFF23241F), onSurfaceVariant = Color(0xFFB4B2A8),
    surfaceContainerLowest = Color(0xFF0B0B09), surfaceContainerLow = Color(0xFF151613),
    surfaceContainer = Color(0xFF191A17), surfaceContainerHigh = Color(0xFF23241F),
    surfaceContainerHighest = Color(0xFF2C2D28),
    outline = Color(0xFF5A5B53), outlineVariant = Color(0xFF34352F),
    error = Color(0xFFFF8A80), onError = Color(0xFF2B0000),
    errorContainer = Color(0xFF4A1410), onErrorContainer = Color(0xFFFFDAD5),
    inverseSurface = Color(0xFFEDEBE4), inverseOnSurface = Color(0xFF151613), inversePrimary = Color(0xFFB8430F),
)

private val LightScheme = lightColorScheme(
    primary = Color(0xFFB0400E), onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFDCCB), onPrimaryContainer = Color(0xFF3A1200),
    secondary = Color(0xFF1A1A17), onSecondary = Color(0xFFF3F0E8),
    secondaryContainer = Color(0xFFE6E1D5), onSecondaryContainer = Color(0xFF1A1A17),
    tertiary = Color(0xFF7A5900), onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFFF3F0E8), onBackground = Color(0xFF1A1A17),
    surface = Color(0xFFF3F0E8), onSurface = Color(0xFF1A1A17),
    surfaceVariant = Color(0xFFE6E1D5), onSurfaceVariant = Color(0xFF4F4D45),
    surfaceContainerLowest = Color(0xFFFFFFFF), surfaceContainerLow = Color(0xFFF8F6F0),
    surfaceContainer = Color(0xFFFFFFFF), surfaceContainerHigh = Color(0xFFEDE9DF),
    surfaceContainerHighest = Color(0xFFE6E1D5),
    outline = Color(0xFF8A877C), outlineVariant = Color(0xFFD3CEC1),
    error = Color(0xFFB3261E), onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFF9DEDC), onErrorContainer = Color(0xFF410E0B),
    inverseSurface = Color(0xFF1A1A17), inverseOnSurface = Color(0xFFF3F0E8), inversePrimary = Color(0xFFFF6B2C),
)

private val DarkExtra = ForzaColors(
    protein = Color(0xFFFF5A55), carbs = Color(0xFFF5C542), fat = Color(0xFF5B9BFF), fibre = Color(0xFF4CC38A),
    water = Color(0xFF59C7F2), pr = Color(0xFFFFD25A), muted = Color(0xFFB4B2A8), success = Color(0xFF4CC38A),
    track = Color(0xFF2C2D28),
)
private val LightExtra = ForzaColors(
    protein = Color(0xFFC62828), carbs = Color(0xFF946C00), fat = Color(0xFF1E5BC6), fibre = Color(0xFF1F7A4D),
    water = Color(0xFF0B6E99), pr = Color(0xFF8A6400), muted = Color(0xFF4F4D45), success = Color(0xFF1F7A4D),
    track = Color(0xFFE0DBCF),
)

val LocalForzaColors = staticCompositionLocalOf { DarkExtra }
// true if the user disabled system animations: no confetti or transitions
val LocalReducedMotion = staticCompositionLocalOf { false }

private val Condensed = FontFamily(androidx.compose.ui.text.font.Typeface(Typeface.create("sans-serif-condensed",Typeface.BOLD)))
private val Body = FontFamily.SansSerif

// Tabular numbers: digits don't "jump" during timers and counters
val NumberStyle = TextStyle(fontFamily = Body, fontWeight = FontWeight.Black, fontFeatureSettings = "tnum")

private val ForzaTypography = Typography().run {
    copy(
        displayLarge = displayLarge.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold, letterSpacing = (-1).sp),
        displayMedium = displayMedium.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold),
        displaySmall = displaySmall.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold),
        headlineLarge = headlineLarge.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold),
        headlineMedium = headlineMedium.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold),
        headlineSmall = headlineSmall.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold),
        titleLarge = titleLarge.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold, fontSize = 24.sp),
        titleMedium = titleMedium.copy(fontWeight = FontWeight.SemiBold),
        labelLarge = labelLarge.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold, letterSpacing = 1.sp,
            fontSize = 15.sp),
        labelMedium = labelMedium.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold, letterSpacing = 1.2.sp),
        labelSmall = labelSmall.copy(fontFamily = Condensed, fontWeight = FontWeight.Bold, letterSpacing = 1.2.sp),
    )
}

// Cut corner like a plate's tag: the visual signature of buttons and chips
val TagShape = CutCornerShape(topEnd = 10.dp, bottomStart = 10.dp)
val CardShape = RoundedCornerShape(6.dp)

private val ForzaShapes = Shapes(
    extraSmall = RoundedCornerShape(3.dp),
    small = CutCornerShape(topEnd = 8.dp),
    medium = CardShape,
    large = RoundedCornerShape(8.dp),
    extraLarge = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
)

@Composable
fun ForzaTheme(dark: Boolean, dynamic: Boolean, content: @Composable () -> Unit) {
    val ctx = LocalContext.current
    val scheme: ColorScheme = when {
        dynamic && Build.VERSION.SDK_INT >= 31 -> if (dark) dynamicDarkColorScheme(ctx) else dynamicDarkColorScheme(ctx)
        dark -> DarkScheme
        else -> LightScheme
    }
    val reduced = remember() {
        Settings.Global.getFloat(ctx.contentResolver, Settings.Global.ANIMATOR_DURATION_SCALE, 1f) = 0f
    }
    CompositionLocalProvider(
        LocalForzaColors provides if (dark) DarkExtra else LightExtra,
        LocalReducedMotion provides reduced,
    ) {
        MaterialTheme(colorScheme = scheme, typography = ForzaTypography, shapes = ForzaShapes, content = content)
    }


}