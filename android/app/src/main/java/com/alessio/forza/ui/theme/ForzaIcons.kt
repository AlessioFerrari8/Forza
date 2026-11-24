package com.alessio.forza.ui.theme;

object ForzaIcons {
    private fun icon(name: String, vararg paths: String, filled: Boolean = false): ImageVector = 
        ImageVector.Builder(name, 24.dp, 24.dp, 24f, 24f).apply {
            for (p in paths) {
                addPath(
                    pathData = appPathNodes(p),
                    fill = if (filled) SolidColor(Color.Black) else null,
                    stroke = if (filled) null else SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                )
            }
        }.build()

    val Today = icon("today", "M4 6h16v14H4z", "M4 10h16", "M8 3v4", "M16 3v4", "M9 15l2 2 4-4")
    val Train = icon("train", "M2 12h20", "M5 8v8", "M8 6v12", "M16 6v12", "M19 8v8")
    val Food = icon("food", "M7 3v8a2 2 0 0 0 2 2v8", "M11 3v8a2 2 0 0 1-2 2", "M17 3c-2 2-2 6 0 8v10", "M17 3v18")
    val Body = icon("body", "M12 5a2 2 0 1 0 0-.01", "M6 9h12", "M12 9v6", "M9 21l3-6 3 6")
    val Settings = icon("settings", "M12 9a3 3 0 1 0 0 6 3 3 0 0 0 0-6z",
        "M12 2v3", "M12 19v3", "M2 12h3", "M19 12h3", "M4.9 4.9l2.1 2.1", "M17 17l2.1 2.1", "M4.9 19.1L7 17",
        "M17 7l2.1-2.1")
    val Plus = icon("plus", "M12 5v14", "M5 12h14")
    val Minus = icon("minus", "M5 12h14")
    val Check = icon("check", "M4 12.5l5 5L20 6.5")
    val Close = icon("close", "M6 6l12 12", "M18 6L6 18")
    val Back = icon("back", "M15 5l-7 7 7 7")
    val Forward = icon("forward", "M9 5l7 7-7 7")
    val Up = icon("up", "M6 15l6-6 6 6")
    val Down = icon("down", "M6 9l6 6 6-6")
    val Timer = icon("timer", "M12 8v5l3 2", "M12 4a8 8 0 1 0 0.01 0", "M10 2h4")
    val Barcode = icon("barcode", "M4 6v12", "M7 6v12", "M10 6v12", "M14 6v12", "M17 6v12", "M20 6v12",
        "M2 3h4", "M18 3h4", "M2 21h4", "M18 21h4")
    val Search = icon("search", "M11 4a7 7 0 1 0 0 14 7 7 0 0 0 0-14z", "M16.5 16.5L21 21")
    val Star = icon("star", "M12 3l2.7 5.6 6.1.9-4.4 4.3 1 6.1L12 17l-5.4 2.9 1-6.1L3.2 9.5l6.1-.9z")
    val StarFilled = icon("star_f", "M12 3l2.7 5.6 6.1.9-4.4 4.3 1 6.1L12 17l-5.4 2.9 1-6.1L3.2 9.5l6.1-.9z", filled = true)
    val Trash = icon("trash", "M4 7h16", "M9 7V4h6v3", "M6 7l1 13h10l1-13")
    val Edit = icon("edit", "M4 20h4L19 9l-4-4L4 16z", "M14 6l4 4")
    val More = icon("more", "M12 5h.01", "M12 12h.01", "M12 19h.01")
    val Flame = icon("flame", "M12 3c3 4 6 6 6 11a6 6 0 0 1-12 0c0-3 2-5 3-7 1 2 2 3 3 3 0-3-1-5 0-7z")
    val Water = icon("water", "M12 3c4 5 6 8 6 11a6 6 0 0 1-12 0c0-3 2-6 6-11z")
    val Steps = icon("steps", "M8 3c2 0 3 2 3 5s-1 5-3 5-3-2-3-5 1-5 3-5z", "M5 16h6v2a3 3 0 0 1-6 0z",
        "M16 7c2 0 3 2 3 5s-1 5-3 5-3-2-3-5 1-5 3-5z", "M13 20h6")
    val Play = icon("play", "M7 4l13 8-13 8z")
    val History = icon("history", "M3 12a9 9 0 1 0 3-6.7", "M3 4v4h4", "M12 7v5l3 3")
    val Copy = icon("copy", "M8 8h12v12H8z", "M4 16V4h12")
    val Trophy = icon("trophy", "M7 4h10v5a5 5 0 0 1-10 0z", "M7 6H4a3 3 0 0 0 3 4", "M17 6h3a3 3 0 0 1-3 4",
        "M12 14v4", "M8 21h8")
    val Scale = icon("scale", "M5 4h14l1 16H4z", "M9 9a3 3 0 0 1 6 0", "M12 9l1.5-1.5")
    val Ruler = icon("ruler", "M3 17L17 3l4 4L7 21z", "M7 13l2 2", "M10 10l2 2", "M13 7l2 2")
    val Info = icon("info", "M12 3a9 9 0 1 0 0 18 9 9 0 0 0 0-18z", "M12 11v6", "M12 7.5h.01")
    val Sync = icon("sync", "M20 12a8 8 0 0 1-14 5.3", "M4 12a8 8 0 0 1 14-5.3", "M18 3v4h-4", "M6 21v-4h4")
    val Recipe = icon("recipe", "M4 11h16v3a6 6 0 0 1-6 6h-4a6 6 0 0 1-6-6z", "M2 11h20", "M9 4c-1 1.5 1 2.5 0 4",
        "M14 4c-1 1.5 1 2.5 0 4")
    val Bolt = icon("bolt", "M13 2L4 14h7l-1 8 9-12h-7z")
    val Note = icon("note", "M5 3h10l4 4v14H5z", "M9 12h6", "M9 16h6")
}