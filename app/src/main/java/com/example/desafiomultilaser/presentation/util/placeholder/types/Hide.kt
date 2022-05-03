package com.example.desafiomultilaser.presentation.util.placeholder.types

import com.example.desafiomultilaser.presentation.util.placeholder.Placeholder

class Hide : Placeholder {
    override val progressVisible: Boolean get() = false
    override val visible: Boolean get() = false
}