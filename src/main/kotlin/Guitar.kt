package org.example

import org.example.Enums.Builder
import org.example.Enums.Type
import org.example.Enums.Wood

class Guitar(
    val serialNumber: Int,
    val price: Int,
    val builder: Builder,
    val model: String,
    val type : Type,
    val backWood: Wood,
    val topWood: Wood) {

}
