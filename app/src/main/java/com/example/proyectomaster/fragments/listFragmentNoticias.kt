package com.example.proyectomaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.proyectomaster.R
import com.example.proyectomaster.adapters.NoticiaListAdapter
import com.example.proyectomaster.objects.noticia

/**
 * A simple [Fragment] subclass.
 */
class listFragmentNoticias : Fragment() {

    lateinit var v: View

    lateinit var recNoticias : RecyclerView

    var noticias : MutableList<noticia> = ArrayList<noticia>()

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var noticiaListAdapter: NoticiaListAdapter

    companion object {
        fun newInstance() = FragmentNoticias()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list_noticias, container, false)
        recNoticias = v.findViewById(R.id.rec_noticias)
        return v
    }


    override fun onStart() {
        super.onStart()

        noticias.add(noticia("Los riesgos de ser un paciente con enfermedad "
/*titulo2*/ , "Los riesgos de ser un paciente con enfermedad cardiovascular en época del COVID-19"
/*cuerpo*/  , "Encuesta de la Fundación Cardiológica Argentina que muestra el Lado B de esta pandemia.\n" +
                "\n" +
                "La edad media de los encuestados fue 56 años. La mayoría mujeres (66.8%).\n" +
                "El 42% refirió haber necesitado atención médica por su enfermedad cardiovascular (ECV), pero más de la mitad no pudieron hacerla (57.9%).\n" +
                "Casi 4 de cada 10 no recibieron la vacunación correspondiente (36.7%).\n" +
                "5.5 de cada 10 se sintió muy o más o menos desprotegido por parte de su sistema de salud.\n" +
                "Buenos Aires, 15 de mayo de 2020. La Fundación Cardiológica Argentina (FCA) presenta los resultados de una encuesta desarrollada para conocer el acceso a la atención médica e información sanitaria en pacientes con enfermedades cardiovasculares durante el aislamiento social obligatorio y preventivo.\n" +
                "\n" +
                "En la Fundación Cardiológica Argentina sabemos que nunca es buen momento para estar enfermo pero, ante la situación que estamos atravesando en nuestro país a partir de las medidas de aislamiento dispuestas para combatir la pandemia del COVID-19, nos encontramos frente a una realidad particularmente estresante para quienes puedan necesitar atención médica por otra causa.\n" +
                "\n" +
                " \n" +
                "\n" +
                "“Somos conscientes de que, por un lado, la atención médica está centrada en el COVID-19 y por el otro, por temor a salir de sus hogares y contagiarse de coronavirus, muchos pacientes demoran la consulta, aún teniendo síntomas de alerta. En este sentido, es muy importante recordar que las personas con enfermedades crónicas necesitan atención, ya que en época de pandemia se corre el riesgo de que haya un aumento en la mortalidad de origen cardiovascular (CV), un grupo de afecciones que, en Argentina y en el mundo, son la primera causa de muerte”, afirma el doctor Jorge Tartaglione, presidente de la Fundación Cardiológica Argentina.\n" +
                "\n" +
                "Las patologías preexistentes siguen su curso sin controles, lo que puede conducirnos a un desastre sanitario. “Los accidentes cerebrovasculares y los infartos cardíacos continúan ocurriendo y las principales enfermedades crónicas que sufren los argentinos corren riesgo de quedar desatendidas en épocas de pandemia. Esto nos llevó a querer conocer qué y cómo se siente el paciente con enfermedad cardiovascular en nuestro país”, agrega la doctora Stella Pereiro, miembro del Comité Ejecutivo de la FCA y directora de investigación de la “Encuesta para pacientes con enfermedad cardiovascular en la época de COVID-19”.\n" +
                "\n" +
                "Este escenario se produce por varios factores: temor de las personas a contagiarse el coronavirus en el hospital, preocupación de tener problemas para movilizarse, no tener disponible a su médico de cabecera o la decisión del paciente de postergar estudios y consultas hasta que termine el aislamiento.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Datos más relevantes de la encuesta:\n" +
                "\n" +
                " \n" +
                "\n" +
                "Atención médica: cuatro de cada 10 pacientes refieren haber necesitado atención médica por su enfermedad cardiovascular (ECV) (42%). De aquellos pacientes que requirieron consultar, más de la mitad no pudieron hacerla (57.9%).\n" +
                "Causas de la falta de acceso a la consulta: 68.2% falta de atención por parte del sistema de salud.\n" +
                "Uso de la tecnología: 51% NO tuvieron acceso a algún tipo de consulta virtual por su enfermedad cardiovascular. El 62% de los que tuvieron acceso, NO necesitaron utilizarla.\n" +
                "Necesidad de recetas médicas para el tratamiento de la ECV (72%). De los cuales, la mayoría tuvo  acceso con normalidad (60.6%), algo dificultoso (19.8%), extremadamente dificultoso (5.9%). Y un  13% no consiguió recetas.\n" +
                "La vacunación en los pacientes con ECV es de vital importancia para evitar formas graves de neumonía o gripe. Solo el 41.4% de las personas pudo vacunarse con normalidad. Lamentablemente casi 4 de cada 10 pacientes no recibió la vacunación correspondiente (36.7%).\n" +
                "Al consultar sobre si los sistemas de salud brindaban educación sanitaria calificada y seria sobre las patologías cardiovasculares o COVID-19, casi la mitad de los encuestados informaron negativamente (45%) versus el 38% que informaron que sí, pero 63.6% no la utilizaron. 7.6% no saben si su sistema de salud brinda educación por algún medio y 8.3% realizaron investigación personal.\n" +
                "Con el fin de conocer si se sentían protegidos por su sistema de salud ante la situación actual, casi 2 de cada 10 encuestados informó sentirse muy desprotegido (19.2%) y 35.4% mas o menos desprotegido. 45% se sintieron protegidos, pero solo el 18% de este grupo se sintió muy protegido. (5.5 de cada 10 se sintió muy o mas o menos desprotegido)\n" +
                "Aislamiento: los encuestados autopercibieron, en el 92,4% de los casos, que cumplieron totalmente el aislamiento social preventivo obligatorio, 3,4%  refieren haber hecho algunas salidas innecesarias y el 4% refirieron no haber podido cumplir con el aislamiento.\n" +
                " \n" +
                "\n" +
                "Metodología y ficha técnica:\n" +
                "\n" +
                "Objetivo: proporcionar datos sobre el acceso a la atención médica e información sanitaria durante el aislamiento preventivo y obligatorio a causa de la pandemia por COVID-19.\n" +
                "\n" +
                "La encuesta se realizó entre el 1 y el 6 de mayo de 2020. Se utilizó Google Formularios y constó de 15 preguntas.\n" +
                "\n" +
                "La muestra estuvo integrada por 1536 habitantes de la República Argentina con enfermedad Cardiovascular (ECV) que accedieron a la encuesta en forma voluntaria y por auto reporte. De éstos, se descartaron 49 por no presentar enfermedad cardiovascular, por lo tanto, el análisis final se llevó a cabo sobre una muestra de 1487 encuestas.\n" +
                "\n" +
                "La edad media fue 56.17 (DE ±14.0) años, siendo la mayoría de los respondedores mujeres (66.8%).\n" +
                "\n" +
                "La asistencia médica que informaron los encuestados correspondió el 44.3% a Obra Social, 29% Medicina Prepaga, sector público  y PAMI 10.8% y 11% respectivamente y 7.1% en forma particular.\n" +
                "\n" +
                "La distribución de las enfermedades cardiovasculares más frecuentes, donde el encuestado informa la que considera más importante y para la cual se encuentra medicado fue:  52.1%  Hipertensión arterial 10% infarto de miocardio, 8,1% insuficiencia cardíaca crónica y 6.9% arritmias. El resto se distribuyó entre otras enfermedades (aparición Cardiopatías congénitas, portador de marcapasos u otro dispositivo, cirugía cardíaca (de by pass o válvulas), angina de pecho sin infarto, angioplastia coronaria, enfermedad valvular, etc.)"
/*autor*/   , ""
/*fecha*/   , "Noticias | 15 may 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/535_760.jpg?v=18"))


        noticias.add(noticia("Documento de posición Sociedad Argentina de"
/*titulo2*/ , "Documento de posición Sociedad Argentina de Cardiología – Fundación Cardiológica Argentina: Enfermedad Cardiovascular en tiempos de COVID-19"
/*cuerpo*/  , "Resumen\n" +
                "\n" +
                "Las medidas de aislamiento y el mensaje al pueblo argentino han sido efectivas en reducir la propagación del COVID-19.\n" +
                "Existen crecientes informes de  menos consultas y realización de procedimientos cardiovasculares en regiones afectadas  por la pandemia (tanto en Argentina como en el resto del mundo). También se produjo un aumento marcado de la mortalidad total en varios países durante la pandemia que no se explica totalmente por el virus, evidencia de que  está aumentada la mortalidad de otras enfermedades .\n" +
                "La enfermedad cardiovascular (ECV)  (infarto de miocardio, accidente cerebrovascular e insuficiencia cardíaca)  lidera el ranking en muertes , ya sea a nivel global como en Argentina (100,000 muertes anuales, 280 muertes por día), como así también en años perdidos de vida ajustados por discapacidad.\n" +
                "Creemos imperiosa la necesidad de informar a la sociedad ya las autoridades sanitarias que existen un incremento marcado de la mortalidad por enfermedades cardiovasculares  debido al mal control clínico,  la postergación  y la no realización de procedimientos  no invasivos (estudios de imágenes) e invasivos (cateterismos diagnósticos y terapéuticos), cirugías, que han reducido la morbimortalidad en estos pacientes.\n" +
                "Presentamos un protocolo  para darle continuidad a la atención de los pacientes con enfermedad cardiovascular reduciendo al mínimo posible la propagación del virus.\n" +
                "Presentamos un plan de implementación. \n" +
                "Racionalidad de un plan de acción para dar continuidad a la atención de pacientes con problemas cardiovasculares\n" +
                "\n" +
                "A multas de 2019 verifique la pandemia relacionada con el SARS-CoV-2, con propagación a nivel global durante el primer trimestre del año 2020. El COVID-19 tuvo un colapso del sistema de salud en diferentes regiones del mundo, lo que motivó la toma de medidas preventivas en el resto de la población promovida por las autoridades sanitarias. Las medidas implementadas, cuentos como distanciamiento social y cierre de la actividad laboral, han sido efectivas en reducir la propagación del virus. Pero, paralelamente, han generado la cancelación de consultas y procedimientos médicos, lo que puede tener daños colaterales en los pacientes con otras enfermedades pre-afectadas, o en aquellos susceptibles a desarrollarlas. \n" +
                "\n" +
                "Creemos que es oportuno informar precozmente a la sociedad ya las autoridades sanitarias que demuestren, reducir la intensidad o dejar de cumplir con las medidas de prevención y tratamiento que han evaluado el beneficio en pacientes con enfermedad cardiovascular (ECV), va indefectiblemente a causar mayor mortalidad.\n" +
                "\n" +
                "Algunos datos epidemiológicos\n" +
                "\n" +
                "La ECV es la primera causa de muerte global. Se estima que cada año mueren 18 millones de personas por esta causa, representando el 31.8% del total de todas las muertes. También representa la mayor carga de enfermedad definida por años de vida perdidos ajustados por discapacidad (DALY), con 4.800 DALY por cada 100.000 habitantes. 1\n" +
                "\n" +
                "A pesar de que la carga de ECV aumenta año a año, esta va decayendo cuando se contempla el envejecimiento global de la población. En otras palabras, se estima que las intervenciones basadas en la evidencia que se implementan (como modificaciones del estilo de vida, medicamentos, procedimientos quirúrgicos y por catéteres) están traduciendo en un mejor control de la carga global de enfermedad por ECV. 2\n" +
                "\n" +
                "Desde 1990 a 2013, se redujo la mortalidad por ECV hasta un 22% (376 a 293 por 100,000 habitantes), lo que hoy sería equivalente a deducir que en 2019 se han salvado cerca de 4 millones de vidas.2 Un sistema deficiente, en el cual los pacientes no consultan o no se les da prioridad de atención por culpa de la pandemia, se comportan como un retroceso en estos avances y causan un aumento prevenible de muertes por ECV. 2\n" +
                "\n" +
                " \n" +
                "\n" +
                "Evidencia objetiva de que ha disminuido el tratamiento adecuado de la ECV\n" +
                "\n" +
                "En España, se detectó una caída del 40% de la utilización de angioplastia coronaria en pacientes con infarto agudo de miocardio (tratamiento estándar) y un 80% en procedimientos de cardiopatía estructural durante la pandemia (por ejemplo, estenosis aórtica severa). 3  A esto se le agregan múltiples reportes en medios periodísticos, incluyendo una caída del 38% de las angioplastias primarias (para infarto en curso), con un consecuente incremento de gran magnitud en los paros cardíacos fatales en los domicilios en la ciudad de Nueva York . 4 4 \n" +
                "\n" +
                "La infrautilización de tratamientos que han obtenido beneficio clínico se traducirá en un incremento de la mortalidad. Por ejemplo, se ha observado en ciertas regiones de Europa un incremento de la mortalidad total al doble o triple, superior a la adjudicable por COVID-19. Si bien esto puede darse por testeo insuficiente, la mayoría de los pacientes que fallecen lo hacen en el medio hospitalario, donde la mayoría han sido testeados. Por lo tanto, este incremento desmedido de la mortalidad puede ser una evidencia indirecta del peor manejo de las urgencias o emergencias no relacionadas al COVID-19. 5 5\n" +
                "\n" +
                " \n" +
                "\n" +
                "Factores que afectan la menor atención de los pacientes cardiovasculares:\n" +
                "\n" +
                "Preocupación de los pacientes respecto de consultar por temor a contagiar el virus. \n" +
                "Preocupación de los pacientes por tener problemas legales al movilizarse hasta el hospital para consultar.\n" +
                "Cancelación de agendas médicas por aislamiento obligatorio.\n" +
                "Personal de salud considerado población de riesgo para COVID-19 bajo licencia mientras dure la pandemia. \n" +
                "En las resoluciones, quedan dudas sobre qué procedimientos o qué consultas estarían justificadas a tratados.\n" +
                "Instituciones médicas polivalentes (públicas y privadas) que desvían recursos para poder contener el posible colapso sanitario.\n" +
                " \n" +
                "\n" +
                "La calidad y el acceso a la salud son esenciales para disminuir la mortalidad de la ECV\n" +
                "\n" +
                "Los países de medianos y bajos ingresos incluidos entre 3 y 6 veces más riesgo de presentar enfermedad cardiovascular fatal que los países de altos ingresos, respectivamente. 6  Si bien este incremento del riesgo está asociado a diferencias socioculturales, la integridad y el acceso a la salud es probablemente el mayor contribuyente de este exceso de eventos cardiovasculares fatales. Cree que la calidad y el acceso a la salud están estrechamente relacionados con la reducción de ECV observada en las últimas décadas. 7 7\n" +
                "\n" +
                "Si bien estamos en una etapa temprana de la pandemia, ya existe evidencia indirecta de que la desatención de la ECV está causando un incremento objetivo de la mortalidad. Se consideró un incremento de mortalidad total en ciertas regiones de España, Italia y Europa por encima de lo esperado por la pandemia COVID-19. 5 5\n" +
                "\n" +
                " \n" +
                "\n" +
                "Estado de la ECV en Argentina:\n" +
                "\n" +
                "En 2017 fallecieron más de 97,000 personas por afecciones cardiovasculares, liderando el ranking del total de las causas de muerte con 28.5%. 8  Al focalizarnos en los años de vida perdidos (entre los 30 y 70 años), la enfermedad cardiovascular es responsable de la mayor cantidad de muertes prematuras (35% en hombres y el 28% en las mujeres, primera causa en ambos sexos).\n" +
                "\n" +
                "Desde el año 2000 al 2010, en la Argentina se redujo la tasa de mortalidad cardiovascular en hombres un 22% (de 271.4 a 211.6 por cada 100,000 habitantes). Según el estudio del ¨Global Burden of Disease¨ (GBD), esta reducción de mortalidad se adjudica mayoritariamente a una mejora en la calidad y el acceso a la salud. Un sistema donde los pacientes tienen preocupaciones que lo inducen a no consultar (ya sea para sus problemas crónicos o, incluso, por síntomas de descompensación), o no se prioriza la atención por la situación actual, causando un aumento prevenible de muertes por ECV.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Propuestas de implementación de un proceso de continuidad de atención cardiovascular\n" +
                "\n" +
                "Lo dividiremos en medidas para el sistema de atención, estudios / tratamientos y medidas de difusión a la población.\n" +
                "\n" +
                " \n" +
                "\n" +
                "I. Medidas para el sistema de atención de la salud\n" +
                "\n" +
                "Objetivo a lograr: Garantizar la atención cardiovascular con la menor posibilidad de contacto hacia los pacientes y los profesionales de la salud.\n" +
                "\n" +
                "Los contactos presenciales del paciente con el sistema de salud tendrán el rendimiento bajo las normas especiales de bioseguridad que reducen al mínimo el riesgo de contacto por COVID-19. Este aspecto debe contemplar diferentes situaciones\n" +
                "\n" +
                "Consultas por guardia a las instituciones\n" +
                "\n" +
                "a. En el traslado  de los pacientes en emergencia por sus familiares, facilitar una línea telefónica especial para la autorización del traslado y la coordinación con vías rápidas en autopista o avenidas, liberando los controles.\n" +
                "\n" +
                "b. Separación de los circuitos de atención  de pacientes para consultas por guardia en dos: sectores de sospecha de posibles infecciones y sectores para patologías generales con baja sospecha. Esta separación comprende también los circuitos de circulación de los pacientes y los sectores de internación.\n" +
                "\n" +
                "c. Aún en los sectores no COVID , durante la pandemia todo paciente nuevo debe ser  afectado potencialmente infectado  a las multas de las precauciones para el personal de salud, siguiendo las normas de infectología (sistemas de protección personal, camisolines, etc.).\n" +
                "\n" +
                "d. Aún en los sectores no COVID, debe extremarse la limpieza  de todas las superficies con las que tiene contacto con el paciente (sillas, puertas, ecógrafos, estetoscopios, camilla, etc.) así como también debe implementar la rutina del uso de barbijo para pacientes, familiares, médicos y enfermeros.\n" +
                "\n" +
                "Consultas programadas o fuera de la urgencia o emergencia\n" +
                "\n" +
                "a. Fomentar la telemedicina  a través de consultas virtuales, las que deben ser reconocidas como un verdadero acto médico con todas sus implicaciones: responsabilidad legal, recetas virtuales y retribución. \n" +
                "\n" +
                "b. Autorizar el funcionamiento de consultorios  ambulatorios de las especialidades para las circunstancias que requieren la evaluación clínica presencial.\n" +
                "\n" +
                "c. Facilitar la asistencia  de los pacientes, dándoles autorización para transferir, junto con un solo familiar en lo posible, por mecanismos simples validados por los profesionales (permiso virtual).\n" +
                "\n" +
                "d. Facilitar el acceso a la medicación,  especialmente en los pacientes sin cobertura.\n" +
                "\n" +
                "Consultas a los sistemas de emergencia\n" +
                "\n" +
                "a. Las ambulancias y sistemas de emergencia  deben segmentar por triaje los llamados en pacientes potencialmente COVID o no COVID.\n" +
                "\n" +
                "b.  Mientras dura la epidemia, el personal de salud debe contar con  material de protección  para evitar el contacto identificado del motivo del llamado, y seguir las normas pautadas para la atención.\n" +
                "\n" +
                "c.  En el caso de las consultas cardiovasculares, las  ambulancias deben estar provistas de electrocardiógrafos  para evaluar si se trata de un cuadro coronario agudo u otros cuadros de emergencia.\n" +
                "\n" +
                "d.  La derivación debe orientarse hacia las instituciones del sistema de cobertura que cuenten con los  recursos para la asistencia de alta complejidad del cuadro,  independiente de la proximidad.\n" +
                "\n" +
                "e.  El ingreso de los pacientes cardiovasculares que deben segmentarse siguiendo  el circuito Sin  COVID.\n" +
                "\n" +
                " \n" +
                "\n" +
                "II Estudios y procedimientos\n" +
                "\n" +
                "Objetivo a lograr: \n" +
                "No hay postergar tratamientos o estudios cardiovasculares necesarios debido a la pandemia, sino que realiza con estrictas normas de protección.\n" +
                "\n" +
                "En la medida en que la actual circunstancia se mantenga, con las Unidades de Cuidados Intensivos Cardiovasculares semi-ocupadas, sin restricciones postergarse cirugías programadas cardiovasculares, procedimientos endovasculares por hemodinamia ni procedimientos electrofisiológicos.\n" +
                "\n" +
                "Pruebas para COVID\n" +
                "\n" +
                "Debe incrementar el uso de pruebas diagnósticas todo lo que sea posible.\n" +
                "\n" +
                "Debe tener hisopado a los pacientes internados en Unidad Coronaria, a los que presentan insuficiencia cardíaca, a los que tienen que ser sometidos a una cirugía cardíaca y a todos aquellos que requieren mandrillas que sean productoras de aerosoles.\n" +
                "\n" +
                "Una medida que debe evaluar es el incremento del testeo sistemático del personal de salud, en la medida en que se cuente con los recursos.\n" +
                "\n" +
                " \n" +
                "\n" +
                "III Comunicación a la población\n" +
                "\n" +
                "Objetivo a lograr: \n" +
                "Evitar la gran autolimitación de la consulta de la población a través de la información de que se cuenta con los circuitos y recursos adecuados para la asistencia segura de las patologías No COVID.\n" +
                "\n" +
                "Las autoridades afectadas comunican  a la población cómo manejar frente a diferentes problemas de salud que pueden constituir una emergencia grave, como el caso de las enfermedades cardiovasculares y neurológicas agudas.\n" +
                "\n" +
                "Grabe los problemas cardiovasculares que implican la necesidad de consultas  por urgencia al sistema de emergencias oa las guardias.\n" +
                "Dolor de pecho / opresión en el pecho / brazo izquierdo.\n" +
                "Dolores súbitos persistentes por varios minutos, nuevos, en dorso o abdomen.\n" +
                "Falta de aire.\n" +
                "Síncope, pérdida de conocimiento.\n" +
                "Edemas nuevos (piernas hinchadas).\n" +
                "Palpitaciones nuevas.\n" +
                "Dolor súbito con cambio de color o temperatura en los miembros inferiores.\n" +
                "Pérdida de fuerza o sensibilidad en alguna parte del cuerpo.\n" +
                "Comunicar a la población lo enunciado en las estrategias para la atención cardiovascular\n" +
                "a. Que las emergencias están segmentadas, con la mayor garantía de no contagiar.\n" +
                "\n" +
                "b. Que las instituciones se encuentran segmentadas por sectores COVID- No COVID para la atención de todas las patologías.\n" +
                "\n" +
                "c. Que los Servicios cardiovasculares brindan todas las prestaciones de moderada y alta complejidad frente a la demanda de problemas que no deben postergarse.\n" +
                "\n" +
                "d. Toda otra información que facilita la consulta cardiovascular.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Conclusiones\n" +
                "\n" +
                "La enfermedad cardiovascular está subdiagnosticada y subtratada, con la consecuencia potencial de un incremento de la mortalidad.\n" +
                "Si bien el problema es multicausal, el temor a concurrir a la consulta médica o instituciones por el riesgo de contagio y la cuarentena, además de las dificultades en el traslado, la dificultad operativa y la reprogramación de casos electivos pero de alto riesgo, son las causas más importantes.\n" +
                "Las principales medidas propuestas son :\n" +
                "Garantizar atención cardiovascular libre de contagio.\n" +
                "Traslado facilitado de pacientes a consulta y procedimientos.\n" +
                "Separación precisa de atención COVID – No COVID.\n" +
                "Autorizar el funcionamiento de consultorios (manteniendo teleconsulta).\n" +
                "Sistemas de emergencia con triage, electrocardiógrafo y elementos de protección adecuados en ambulancias.\n" +
                "No postergar tratamientos o estudios cardiovasculares sino realizarlos con estrictas normas de seguridad.\n" +
                "Procedimientos rápidos implican estadías cortas.\n" +
                "Flexibilizar y aumentar todo lo posible el uso de tests según se cuente con mayor disponibilidad.\n" +
                "Comunicación efectiva y continua a la población.\n" +
                " \n" +
                "\n" +
                "1 Roth GA, Abate D, Abate KH, Abay SM, et al. Global, regional, and national age-sex-specific mortality for 282 causes of death in 195 countries and territories, 1980–2017: a systematic analysis for the Global Burden of Disease Study 2017. Lancet 2018;392:1736–1788. \n" +
                "\n" +
                "\n" +
                "2 Roth GA, Huffman MD, Moran AE, Feigin V, Mensah GA, Naghavi M, Murray CJL. Global and regional patterns in cardiovascular mortality from 1990 to 2013. Circulation 2015;132:1667–1678 \n" +
                "\n" +
                "3 Rodríguez-Leor. Impacto de la pandemia de COVID-19 sobre la actividad asistencial en cardiología intervencionista en España. Rev Esp Cardiol. DOI: https://doi.org/10.24875/RECIC.M20000120 \n" +
                "\n" +
                "4 Garcia S, Albaghdadi MS, Meraj PM, Schmidt C et al. Reduction in ST-Segment Elevation Cardiac Catheterization Laboratory Activations in the United States during COVID-19 Pandemic. J Am Coll Cardiol 2020. https://linkinghub.elsevier.com/retrieve/pii/S0735109720349135. Accessed April 12, 2020. \n" +
                "\n" +
                "5 https://www.economist.com/graphic-detail/2020/04/03/covid-19s-death-toll-appears- higher-than-official-figures-suggest. \n" +
                "\n" +
                "6 Yusuf S, Rangarajan S, Teo K, et al. Cardiovascular risk and events in 17 low-, middle-, and high-income countries. N Engl J Med 2014;371:818–827. \n" +
                "\n" +
                "7 Barber RM, Fullman N, Sorensen RJD y col. Acceso a la atención médica e índice de calidad basado en la mortalidad por causas susceptibles de atención médica personal en 195 países y territorios, 1990-2015: un análisis novedoso del estudio global de la carga de morbilidad 2015. Lancet 2017; 390: 231–266. \n" +
                "\n" +
                "8 Estadísticas de mortalidad, Argentina. https://www.argentina.gob.ar/salud/instituto-nacional-del-cancer/estadisticas/mortalidad.\n" +
                "\n" +
                " \n" +
                "\n" +
                ""
/*autor*/   , "Comité de Redacción\n" +
                "Dr. José L. Navarro Estrada\n" +
                "Presidente Sociedad Argentina de Cardiología Hospital Italiano de Buenos Aires \n" +
                "\n" +
                "Dr. Alejandro Hershson\n" +
                "Presidente-Electo Sociedad Argentina de Cardiología Fundación Favaloro \n" +
                "\n" +
                "Dr. Héctor Deschle\n" +
                "Vicepresidente 1 ° Sociedad Argentina de Cardiología Diagnóstico Maipú \n" +
                "\n" +
                "Dr. Jorge Tartaglione\n" +
                "Presidente Fundación Cardiológica Argentina Hospital Churruca Visca \n" +
                "\n" +
                "Dr. Carlos Tajer\n" +
                "Jefe de Cardiología Hospital El Cruce \n" +
                "\n" +
                "Dr. Álvaro Sosa Liprandi\n" +
                "Jefe de Cardiología Sanatorio Güemes \n" +
                "\n" +
                "Dr. Simón Salzberg\n" +
                "Jefe de Cardiología Hospital Fernández \n" +
                "\n" +
                "Dr. Rubén Kevorkián\n" +
                "Jefe de Cardiología Hospital Santojanni \n" +
                "\n" +
                "Dr. Juan Gagliardi\n" +
                "Jefe División Cardiología Hospital Gral. de Agudos Dr. Cosme Argerich \n" +
                "\n" +
                "Dr. Marcelo Trivi\n" +
                "Jefe Cardiología Clínica Instituto Cardiovascular de Buenos Aires (ICBA)"
/*fecha*/   , "Noticias | 23 abr 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/534_760.png?v=7"))


        noticias.add(noticia("Sedentarismo, una pandemia mundial de gran impacto en"
/*titulo2*/ , "Sedentarismo, una pandemia mundial de gran impacto en tiempos de Coronavirus"
/*cuerpo*/  , "El 2020 comenzó con una crisis en la salud de todo el mundo debido a la creciente expansión del COVID-19, hoy ya considerado una pandemia. Miles de muertes diarias son ocasionadas por este virus en todo el planeta y genera un colapso en el sistema sanitario de los países a los que afecta. La morbimortalidad de esta enfermedad no es para nada despreciable, por eso es tan importante poner atención y llevar a cabo las medidas necesarias para disminuir nuestro riesgo y el de nuestro entorno.\n" +
                    "\n" +
                    "Ahora bien, sin ir más lejos tenemos frente a nuestros ojos otra pandemia que afecta a más de la mitad de la población mundial (y de nuestro país), y que provoca más de 3.200.000 (si, millones) muertes al año, siendo el cuarto factor de riesgo de mortalidad generada por enfermedades no transmisibles (o prevenibles)[1].\n" +
                    "\n" +
                    "La pandemia del sedentarismo es bien conocida, y a pesar de que algunos países comenzaron a tomar medidas para estimular la actividad física, cada vez menos gente realiza el mínimo de actividad física recomendada para mantener un hábito saludable. Para lograr esto, la Organización Mundial de la Salud (OMS) sugiere realizar 30 minutos de actividad física al menos 5 días a la semana, ya sea en sesiones de 10 minutos o como nos resulte más cómodo; pero al menos alcanzar 150 minutos de movimiento físico por semana.\n" +
                    "\n" +
                    "Este 6 de abril, “Día Mundial de la Actividad Física”, nos encuentra en circunstancias muy particulares. Probablemente, en un entorno en el cual es muy difícil cumplir con estas metas mínimas para no aumentar nuestro riesgo cardiovascular. Sin embargo, para empezar, solo necesitamos ponernos unas zapatillas y apagar la TV un rato así arrancamos a movernos y cuidarnos aun dentro de casa.\n" +
                    "\n" +
                    "De esta manera, y sin mucho más, estaremos disminuyendo nuestro riesgo cardiovascular. Realizar actividad física regularmente disminuye alrededor del 30% el riesgo de tener problemas de corazón, y no es poco ya que hoy en día es la principal causa de mortalidad a nivel mundial[2].\n" +
                    "\n" +
                    "No necesitamos grandes espacios, ni pesas ni bancos de gimnasio; no necesitamos cintas o bicicletas (si la tenemos, es un buen momento para dejar de usarla de perchero); solo necesitamos un rato de nuestro tiempo para hacer algunos movimientos físicos. Podemos recurrir a algunas aplicaciones en el teléfono o videos de YouTube que nos guíen. Incluso hoy muchos gimnasios tienen en sus redes sociales guías gratuitas para continuar con los ejercicios en nuestras casas.\n" +
                    "\n" +
                    "Desde la Fundación Cardiológica Argentina (FCA) recomendamos fuertemente cuidar nuestra salud en todos sus aspectos, y realizar actividad física es uno de ellos. En cualquier contexto, con el mínimo espacio, y sin necesidad de tener un gimnasio en nuestro cuarto, nos va a permitir no solo disminuir nuestro riesgo cardiovascular sino también brindarnos mayor bienestar psico-físico, algo más que importante en los tiempos que corren.\n" +
                    "\n" +
                    "Encontrá aquí algunos ejercicios y consejos saludables para implementar en casa: http://www.fundacioncardiologica.org/155-Como-mantenernos-saludables-en-casa-en-epocas-del-Coronavirus.note.aspx\n" +
                    "\n" +
                    "Por la Fundación Cardiológica Argentina (FCA), con el asesoramiento del Dr. Gonzalo Diaz Babio, médico cardiólogo (MN 129.388) y miembro de la FCA."
/*autor*/   , ""
/*fecha*/   , "Noticias | 03 abr 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/533_760.png?v=4"))


        noticias.add(noticia("Fumar y vapear predisponen a los pulmones a infecciones"
/*titulo2*/ , "Fumar y vapear predisponen a los pulmones a infecciones respiratorias como el COVID-19"
/*cuerpo*/  , "Desde hace muchos años sabemos que el cigarrillo es perjudicial para la salud. Está claramente demostrado que produce enfermedades muy graves como Cáncer, EPOC, Infarto y ACV, entre otras.\n" +
                    "\n" +
                    "Pero, en los últimos años nos hemos tenido que enfrentar a nuevos desafíos: el tabaquismo y la adicción a la nicotina han resurgido en nuevos formatos, como los cigarrillos electrónicos.\n" +
                    "\n" +
                    "“El aerosol generado por estos dispositivos produce irritación de las vías aéreas superiores y del tejido pulmonar (llamado alveolo). Esto activa toda una línea de respuestas de tipo defensiva en el organismo que en la mayoría de los casos termina empeorando la salud”, explica el Dr. Francisco Toscano Quilon, médico cardiólogo (MN 95.358) y miembro de la Fundación Cardiológica Argentina.\n" +
                    "\n" +
                    "“Como si esto fuera poco, la irritación continua y sostenida de la vía aérea favorece las infecciones de tipo viral como la Gripe estacional, el H1N1 y el Covid-19”, analiza el Dr. Toscano Quilon.\n" +
                    "\n" +
                    "Está absolutamente demostrado que fumar y/o vapear favorece la aparición y la gravedad de la Neumonía por COVID-19. Esto estaría determinado porque el tabaquismo favorece la expresión pulmonar de ciertos receptores que favorecen la unión del virus cuando entra en contacto con el tejido pulmonar.\n" +
                    "\n" +
                    "Estudios realizados en China demostraron que los fumadores tienen 14 veces más probabilidades de evolucionar hacia la Neumonía. De la misma manera, se ha demostrado que los pacientes añosos y tabaquistas tienen mayor riesgo de sobreinfecciones bacterianas.\n" +
                    "\n" +
                    "“Sin dudas, éste es un buen momento para dejar hábitos que dañan nuestra salud como el tabaquismo y el vapeo, no solo para protegernos sino también para proteger a los adultos mayores con los que convivimos”, concluye Toscano."
/*autor*/   , "Por la Fundación Cardiológica Argentina"
/*fecha*/   , "Noticias | 31 mar 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/532_760.jpg?v=3"))


        noticias.add(noticia("RCP y Coronavirus: Cuidados a tener en cuenta por el equipo"
/*titulo2*/ , "RCP y Coronavirus: Cuidados a tener en cuenta por el equipo de salud para reanimar a una persona con COVID-19"
/*cuerpo*/  , "La American Heart Association (AHA) ha publicado en los últimos días una orientación para los profesionales médicos y personal que brinde atención médica durante el brote de COVID-19. Estas recomendaciones[i] alertan al equipo de salud sobre los cuidados que deben tener al practicar RCP a pacientes con infección por COVID-19.\n" +
                    "\n" +
                    "Desde la Fundación Cardiológica Argentina nos sumamos a las recomendaciones difundidas y recordamos los aspectos más relevantes que debe tener en cuenta el personal abocado a esta tarea, sin descuidar los recaudos propios del lugar de trabajo o la ciudad donde se opera para prevenir el riesgo de contagio.\n" +
                    "\n" +
                    "La recomendación de la AHA se enfoca principalmente en que el personal que asiste al paciente no se exponga a los aerosoles que se generan en la RCP, la intubación endotraqueal y la ventilación no invasiva, que podrían transmitir el virus. Enfatiza que la utilización del equipo de protección individual es primordial aunque signifique un retraso en el inicio de las compresiones torácicas.\n" +
                    "\n" +
                    "“El documento señala que si trabajás en la emergencia prehospitalaria es importante que tengas en cuenta que es fundamental que el operador telefónico consulte sobre la posibilidad de que el paciente esté infectado con COVID-19 y, si así fuera, se lo informe al equipo médico del móvil y al hospital al cual será derivado el paciente en caso de ser necesario”, afirma el Dr. Fabián Gelpi, Coordinador de RCP Básica de la Fundación Cardiológica Argentina (FCA).\n" +
                    "\n" +
                    "En el mismo sentido, el Dr. Gelpi explica que la publicación resalta los recaudos que se deben tener en cuenta en la ambulancia al momento del traslado de la persona:\n" +
                    "\n" +
                    "“Asegurate de que los dispositivos de bolsa y máscara, y otros equipos de ventilación, estén equipados con filtros HEPA.\n" +
                    "Con la ambulancia detenida, abrí las puertas traseras del vehículo de transporte y encendé el sistema de ventilación durante los procedimientos de generación de aerosoles (esto debe hacerse lejos del tráfico de peatones).\n" +
                    "No permitas que familiares y amigos viajen en la ambulancia con la persona con posible COVID-19 (si deben viajar, deben usar un barbijo)”.\n" +
                    "Además, suma recomendaciones a tener presentes por el personal médico una vez que el paciente llega al hospital:\n" +
                    "\n" +
                    "“Una vez que tengas los elementos de protección individual, comenzar con las RCP solo con compresiones y controlar el ritmo lo antes posible. No se debe hacer ventilación de boca a boca ni con mascarilla. Según la publicación de la AHA, la intubación de secuencia rápida es el método preferido de intubación ya que se debe evitar el uso de oxigenación nasal de alto flujo y máscara debido a un mayor riesgo de generación de aerosoles.\n" +
                    "Se debe limitar al mínimo la cantidad de personas en la habitación, la que debería estar aislada preferentemente. Se podría designar a una persona que controle el acceso”.\n" +
                    "Estas recomendaciones aplican solamente a pacientes que padecen, o con sospecha de padecer, COVID-19. “En cualquier otro caso se deben aplicar los procedimientos habituales”, advierte Gelpi.\n" +
                    "\n" +
                    "“Ya te enseñamos a hacer RCP, ahora te enseñamos a cuidarte para cumplir mejor tu tarea. Muchas gracias por el enorme esfuerzo que como personal de la salud hacés todos los días por la vida de tus pacientes, y mucho más aun en estos tiempos de pandemia”, finaliza el Dr. Fabian Gelpi."
/*autor*/   , ""
/*fecha*/   , "Noticias | 27 mar 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/357_760.jpg?v=5"))


        noticias.add(noticia("Población de riesgo en casa: consejos para mantener"
/*titulo2*/ , "Población de riesgo en casa: consejos para mantener una rutina saludable que cuide nuestro corazón"
/*cuerpo*/  , "Ante el impacto de la pandemia del Coronavirus en Argentina, las personas con alguna afección cardiaca integran la población de riesgo ante un potencial contagio, al igual que los mayores de 60 años, las embarazadas, las personas con enfermedades respiratorias crónicas, con inmunodeficiencias congénitas adquiridas o insuficiencia renal crónica en diálisis, pacientes oncohematológicos y trasplantados, obesos mórbidos y diabéticos.\n" +
                    "\n" +
                    "Muchas patologías cardíacas agravan el cuadro del virus por eso es muy importante seguir las recomendaciones emitidas por el Ministerio de Salud de la Nación para esta población: mantener las medidas de higiene ya conocidas, comunicarse con el sistema de salud ante la presencia de algún síntoma (aunque sea leve), permanecer en casa la mayor parte del tiempo, minimizar el contacto social y, si viven hogares para personas mayores, evitar las visitas de quienes presenten síntomas respiratorios o que hayan estado en lugares de transmisión los últimos 14 días.\n" +
                    "\n" +
                    "También, es muy importante que si tenían pautada una consulta con el cardiólogo se comuniquen con él para evaluar su urgencia o necesidad, y fundamentalmente mantener los hábitos saludables en casa mientras permanezca esta situación. Continuar la rutina saludable nos permitirá minimizar posibles complicaciones en la salud. Por eso, desde la Fundación Cardiológica Argentina compartimos algunos consejos para lograrlo.\n" +
                    "\n" +
                    "Comamos sano\n" +
                    "\n" +
                    "Es importante abastecerse de alimentos básicos saludables y accesibles. Para elegirlos, siempre intentar darle prioridad a alimentos naturales lo menos procesados posible, comparar las etiquetas nutricionales y seleccionar aquellas opciones con menor cantidad de sal y azúcar agregadas. Algunas ideas pueden ser:\n" +
                    "\n" +
                    "Frutas y verduras enlatadas, congeladas y secas\n" +
                    "Pechugas de pollo congeladas\n" +
                    "Pescados y carnes enlatados como atún claro o pollo de carne blanca envasados \u200B\u200Ben agua\n" +
                    "Legumbres secos o enlatados\n" +
                    "Granos enteros como avena, arroz integral y quinua\n" +
                    "Hierbas y especias secas\n" +
                    "Huevos\n" +
                    "Mantengámonos activos\n" +
                    "\n" +
                    "Estar tanto tiempo en casa, probablemente, nos tiente a mirar más la tele o estar con la computadora o el celular. Algunos consejos para combatir el sedentarismo y mantenernos activos en casa son:\n" +
                    "\n" +
                    "Programá un horario para realizar actividad física.\n" +
                    "Ponete objetivos.\n" +
                    "Hay muchas rutinas que podés seguir día a día y encontrar en internet.\n" +
                    "Recordá estirar, es muy importante antes y después de hacer actividad física.\n" +
                    "Manejemos el estrés\n" +
                    "\n" +
                    "Estamos viviendo una situación que puede generar mucho pánico y ansiedad. La buena noticia es que podemos manejarlo, y desde casa, con algunas medidas sencillas:\n" +
                    "\n" +
                    "Descansá correctamente, establecé un horario para acostarte y levantarte.\n" +
                    "Hacé yoga.\n" +
                    "Practicá meditación."
/*autor*/   , "Por la Fundación Cardiológica Argentina (FCA), con el asesoramiento de la Dra. Fiorella Tartaglione, médica cardióloga (MN 144.259) y miembro FCA."
/*fecha*/   , "Noticias | 20 mar 2020"
/*foto*/    , "http://www.fundacioncardiologica.org/Multimedios/imgs/531_760.jpg?v=3"))



        recNoticias.setHasFixedSize(true) //Marcar el Recycler View como de tamaño fijo

        //Indicar el tipo de layout que va a tener el Recycler View
        linearLayoutManager = LinearLayoutManager(context)
        recNoticias.layoutManager = linearLayoutManager

        noticiaListAdapter = NoticiaListAdapter(noticias,requireContext()){position -> onItemClick(position)}
        //noticiaListAdapter = NoticiaListAdapter(listaDenoticia) //Indicar el tipo de adaptador del item
        recNoticias.adapter = noticiaListAdapter
    }


    fun onItemClick ( position : Int ) {

        var Titulo2 = noticias[position].titulo2
        var Cuerpo = noticias[position].cuerpo
        var Fecha = noticias[position].fecha
        var Autor = noticias[position].autor
        var Imagen = noticias[position].urlImage

        val a12= listFragmentNoticiasDirections.actionListFragmentNoticias2ToFragmentNoticias(Titulo2,Cuerpo,Fecha,Autor,Imagen)
        v.findNavController().navigate(a12)
    }
}
