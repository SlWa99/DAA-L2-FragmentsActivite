package ch.heigvd.iict.daa.template

// Importation des classes nécessaires pour créer un fragment Android
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

// Déclaration d'une constante qui sera utilisée comme clé pour passer des arguments au fragment
private const val ARG_STEP_NUMBER = "step_number"

// Classe StepFragment qui hérite de la classe Fragment
class StepFragment : Fragment() {

    // Companion object, utilisé pour définir des méthodes statiques ou des variables dans une classe en Kotlin.
    // Ici, il est utilisé pour créer une nouvelle instance du fragment avec un argument.
    companion object {

        // Méthode statique pour créer une nouvelle instance du fragment avec un numéro d'étape.
        fun newInstance(stepNumber: Int): StepFragment {
            val fragment = StepFragment()  // Création d'une nouvelle instance du fragment
            val args = Bundle()  // Création d'un objet Bundle pour stocker les arguments
            args.putInt(ARG_STEP_NUMBER, stepNumber)  // Ajout de l'argument (numéro d'étape) au bundle avec la clé définie
            fragment.arguments = args  // Affectation du bundle d'arguments au fragment
            return fragment  // Retourne l'instance du fragment initialisée avec l'argument
        }
    }

    // Méthode qui s'exécute lorsque la vue du fragment est créée.
    // Elle gonfle (inflate) le layout du fragment à partir du fichier XML.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate le layout XML pour ce fragment et retourne la vue correspondante.
        // Ici, 'R.layout.fragment_step' est le fichier de layout XML associé au fragment.
        val view = inflater.inflate(R.layout.fragment_step, container, false)

        // Recherche du TextView dans la vue gonflée grâce à son ID 'step_text'
        val stepTextView: TextView = view.findViewById(R.id.step_text)

        // Récupération de l'argument 'step_number' passé au fragment.
        // Si aucun argument n'est trouvé, la valeur par défaut est 1.
        val stepNumber = arguments?.getInt(ARG_STEP_NUMBER) ?: 1

        // Mise à jour du texte du TextView pour afficher "Étape X", où X est le numéro d'étape récupéré
        stepTextView.text = "Étape $stepNumber"

        // Retourne la vue gonflée qui sera affichée par le fragment
        return view
    }
}