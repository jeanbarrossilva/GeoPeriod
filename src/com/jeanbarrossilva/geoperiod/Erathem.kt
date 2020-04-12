package com.jeanbarrossilva.geoperiod
import com.jeanbarrossilva.geoperiod.Period.*

enum class Erathem(vararg periods: Period) {
    CENOZOIC(QUATERNARY, NEOGENE, PALEOGENE),
    MESOZOIC(CRETACEOUS, JURASSIC, TRIASSIC),
    PALEOZOIC(PERMIAN, CARBONIFEROUS, DEVONIAN, SILURIAN, ORDOVICIAN, CAMBRIAN),
    NEOPROTEROZOIC(EDIACARAN, CRYOGENIAN, TONIAN),
    MESOPROTEROZOIC(STENIAN, ECTASIAN, CALYMMIAN),
    PALEOPROTEROZOIC(STATHERIAN, OROSIRIAN, RHYACIAN, SIDERIAN),
    NEOARCHEAN(NEOARCHEAN_ERATHEM),
    MESOARCHEAN(MESOARCHEAN_ERATHEM),
    PALEOARCHEAN(PALEOARCHEAN_ERATHEM),
    EOARCHEAN(EOARCHEAN_ERATHEM)
}