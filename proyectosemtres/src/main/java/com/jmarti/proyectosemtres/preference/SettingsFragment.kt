package com.jmarti.proyectosemtres.preference

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.jmarti.proyectosemtres.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}