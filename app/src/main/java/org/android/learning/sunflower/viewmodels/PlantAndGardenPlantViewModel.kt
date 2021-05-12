package org.android.learning.sunflower.viewmodels

import org.android.learning.sunflower.data.PlantAndGardenPlant
import java.text.SimpleDateFormat
import java.util.*

// It is not even a view model... How strange
class PlantAndGardenPlantViewModel(plantings: PlantAndGardenPlant) {
    private val plant = checkNotNull(plantings.plant)
    private val gardenPlant = plantings.gardenPlants[0]

    val waterDateString = dateFormat.format(gardenPlant.lastWateringDate.time)
    val plantDateString = dateFormat.format(gardenPlant.plantDate.time)

    val waterInterval get() = plant.wateringInterval
    val imageUrl get() = plant.imageUrl
    val plantName get() = plant.name
    val plantId get() = plant.plantId

    companion object {
        // TODO("Maybe later will be added another locales support")
        private val dateFormat = SimpleDateFormat("MMM d, yyyy", Locale.US)
    }
}