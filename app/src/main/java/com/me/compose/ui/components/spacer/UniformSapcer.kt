package com.me.compose.ui.components.spacer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun VerticalSpacer(height: Dp = 16.dp) {
    Spacer(modifier = Modifier.height(height))
}

@Composable
fun HorizontalSpacer(width: Dp = 16.dp) {
    Spacer(modifier = Modifier.width(width))
}
