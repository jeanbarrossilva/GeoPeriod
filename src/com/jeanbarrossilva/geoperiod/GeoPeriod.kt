package com.jeanbarrossilva.geoperiod

import com.jeanbarrossilva.geoperiod.Erathem.*

/** Represents an eonothem. **/
enum class GeoPeriod(vararg erathems: Erathem) {
    PHANEROZOIC(CENOZOIC, MESOZOIC, PALEOZOIC),
    PRECAMBRIAN_PROTEROZOIC(NEOPROTEROZOIC, MESOPROTEROZOIC, PALEOPROTEROZOIC),
    PRECAMBRIAN_ARCHEAN(NEOARCHEAN, MESOARCHEAN, PALEOARCHEAN, EOARCHEAN);
}