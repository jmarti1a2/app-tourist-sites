package com.jmarti.proyectosemtres.detail
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.jmarti.proyectosemtres.databinding.FragmentDetailBinding
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        return detailBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pointinterest = args.pointinterest

        with(detailBinding){
            nameTextView.text = pointinterest.name
            placeTextView.text = pointinterest.place
            pointTextView.text = pointinterest.point
            informationTextView.text = pointinterest.information
            activitiesTextView.text = pointinterest.activities
            temperatureTextView.text = pointinterest.temperature
            localizationTextView.text = pointinterest.localization
            Picasso.get().load(pointinterest.urlPicture).into(pictureImageView)
        }
    }

}