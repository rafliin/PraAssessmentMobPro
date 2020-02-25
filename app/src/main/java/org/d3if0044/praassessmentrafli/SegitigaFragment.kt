package org.d3if0044.praassessmentrafli


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3if0044.praassessmentrafli.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentSegitigaBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_segitiga, container,false)
        binding.btHitung2.setOnClickListener {
            var alas = binding.etAlasSegitiga.text.toString().toInt()
            var tinggi = binding.etTinggiSegitiga.text.toString().toInt()
            var hasilLuasSegitiga = (alas*tinggi)/2
            var hasilKelilingSegitiga = (alas+tinggi)+(Math.sqrt((Math.pow(alas.toDouble(),2.0)+ Math.pow(tinggi.toDouble(), 2.0))))

            binding.tvLuasSegitiga.text = hasilLuasSegitiga.toString()
            binding.tvKelilingSegitiga.text = hasilKelilingSegitiga.toString()
        }

        binding.btShare.setOnClickListener {

        }
        // Inflate the layout for this fragment
        return binding.root
    }

}
