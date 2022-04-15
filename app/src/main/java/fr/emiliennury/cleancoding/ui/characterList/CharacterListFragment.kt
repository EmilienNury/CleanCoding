package fr.emiliennury.cleancoding.ui.characterList

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.emiliennury.cleancoding.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterListFragment : Fragment() {

    companion object {
        private const val TAG = "CharacterListFragment"
    }

    private val viewModel: CharacterListViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.character_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.allCharacters().observe(viewLifecycleOwner) {
            Log.i(TAG, "onViewCreated: $it")
        }
    }

}