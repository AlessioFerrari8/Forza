package com.alessio.forza.ui.components

// Minimum touch target: 48dp (spec), 56 dp for gym actions
val TouchMin = 48.dp
val TouchGym = 56.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForzaTopBar(title: String, onBack: (() -> Unit)? = null, actions: @Composable RowScope.() -> Unit = {}) {
    TopAppBar(
        title = {
            Text(title.uppercase(), style = MaterialTheme.typography.titleLarge, maxLines = 1,
                overflow = TextOverflow.Ellipsis, modifier = Modifier.semantic { heading() })
        },
        navigationIcon = {
            if (onBack != null) {
                IconButton(onClick = onBack, modifier = Modifier.size(TouchMin)) {
                   Icon(ForzaIcons.Back, contentDescription = stringResource(R.string.action_back)) 
                }
            }
        },
        actions = actions,
        // System insets are already applied by the main Scaffold: no double padding
        windowInsets = androidx.compose.foundation.layout.WindowInsets(0, 0, 0, 0),
        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.background),
    )   
}

@Composable
fun SectionLabel(text: String, modifier: Modifier = Modifier, trai)