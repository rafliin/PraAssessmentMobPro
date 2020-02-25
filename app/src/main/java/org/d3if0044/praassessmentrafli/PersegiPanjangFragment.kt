package org.d3if0044.praassessmentrafli


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if0044.praassessmentrafli.databinding.ActivityMainBinding
import org.d3if0044.praassessmentrafli.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    private lateinit var binding: ActivityMainBinding
    private var panjang = 0
    private var lebar = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate( inflater, R.layout.fragment_persegi_panjang, container, false)
            binding.btHitungPP.setOnClickListener {
                var panjang = etPanjangPP.text.toString().toInt()
                var lebar = etLebarPP.text.toString().toInt()
                var hasilLuas = (panjang*lebar)
                var hasilKeliling = (2*(panjang+lebar))

                tvLuasPP.text = hasilLuas.toString()
                tvKelilingPP.text = hasilKeliling.toString()
            }

        // Inflate the layout for this fragment
        return binding.root
    }

}
