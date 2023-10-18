package com.ana.ejemplofragment.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

import com.ana.ejemplofragment.R
import com.ana.ejemplofragment.databinding.FragmentDetailBinding

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {

    private lateinit var detailBinding: FragmentDetailBinding
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        detailBinding = FragmentDetailBinding.inflate(inflater, container, false)
        val root: View = detailBinding.root

        val superheroe = args.superheroe

        with(detailBinding){
            pictureImageView.setImageResource(superheroe.image)
            nameTextView.text = superheroe.name
            aliasTextView.text= superheroe.alias
            powersTextView.text = superheroe.powers

        }

        return root
    }
}