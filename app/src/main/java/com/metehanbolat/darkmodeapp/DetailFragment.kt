package com.metehanbolat.darkmodeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.metehanbolat.darkmodeapp.databinding.FragmentDetailBinding
import com.metehanbolat.darkmodeapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val imageAdapter by lazy { ImageAdapter(sampleList) }

    @Inject
    lateinit var themeManager: ThemeManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.adapter = imageAdapter

        binding.themeSwitch.setOnCheckedChangeListener { _, isChecked ->
            themeManager.setUITheme(!isChecked)
            binding.themeSwitch.text = if (isChecked) "Dark" else "Light"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

val sampleList = listOf(
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "11",
    "12",
    "13",
    "14",
    "15",
    "16"
)