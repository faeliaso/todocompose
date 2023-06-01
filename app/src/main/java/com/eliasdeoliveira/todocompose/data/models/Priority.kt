package com.eliasdeoliveira.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.eliasdeoliveira.todocompose.ui.theme.HighPriorityColor
import com.eliasdeoliveira.todocompose.ui.theme.LowPriorityColor
import com.eliasdeoliveira.todocompose.ui.theme.MediumPriorityColor
import com.eliasdeoliveira.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
