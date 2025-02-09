package org.android.learning.sunflower.viewmodels

import org.android.learning.sunflower.data.PlantAndGardenPlant
import java.text.SimpleDateFormat
import java.util.*

// It is not even a view model... How strange
class PlantAndGardenPlantViewModel(plantings: PlantAndGardenPlant) {
    private val plant = checkNotNull(plantings.plant)
    private val gardenPlant = plantings.gardenPlants[0]

    val waterDateString: String = DATE_FORMAT.format(gardenPlant.lastWateringDate.time)
    val plantDateString: String = DATE_FORMAT.format(gardenPlant.plantDate.time)

    val waterInterval get() = plant.wateringInterval
    val imageName get() = plant.imageAsset
    val plantName get() = plant.name
    val plantId get() = plant.plantId
}