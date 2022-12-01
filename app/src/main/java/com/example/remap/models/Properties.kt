package com.example.remap.models

data class Properties(
        var categoryBatteries: Boolean,
        var categoryClothes: Boolean,
        var categoryGlass: Boolean,
        var categoryLamps: Boolean,
        var categoryMetal: Boolean,
        var categoryPaper: Boolean,
        var categoryPlastic: Boolean,
        var categoryEcomob: Boolean,
        var property_adress: String,
        var property_contacts: String,
        var property_description: String,
        var property_latitude: Double,
        var property_longitude: Double,
        var property_name: String,
        var property_office_hours: String
        ){
    constructor():this(
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            "",
            "",
            "",
            43.279,
            39.313,
            "",
            "")
}
