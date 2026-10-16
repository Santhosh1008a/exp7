package com.example.exp7

import java.io.Serializable

data class DiscoveryItem(
    val id: Int,
    val title: String,
    val location: String,
    val category: String,
    val rating: String,
    val shortDescription: String,
    val detailedOverview: String,
    val bestSeason: String,
    val imageResId: Int
) : Serializable {
    companion object {
        fun getCuratedDiscoveries(): List<DiscoveryItem> {
            return listOf(
                DiscoveryItem(
                    id = 1,
                    title = "Santorini Archipelago",
                    location = "Cyclades, Greece",
                    category = "Island & Architecture",
                    rating = "4.9",
                    shortDescription = "Whitewashed cubic houses perched on volcanic caldera cliffs overlooking the deep blue Aegean Sea.",
                    detailedOverview = "Santorini is one of the Cycladic islands in the Aegean Sea. It was devastated by a volcanic eruption in the 16th century BC, forever shaping its rugged landscape. The whitewashed, cubiform houses of its principal towns, Fira and Oia, cling to cliffs above an underwater caldera.",
                    bestSeason = "May to October",
                    imageResId = R.drawable.dest_santorini
                ),
                DiscoveryItem(
                    id = 2,
                    title = "Kyoto Bamboo Grove",
                    location = "Kyoto, Japan",
                    category = "Nature & Culture",
                    rating = "4.8",
                    shortDescription = "A mesmerizing path winding through towering stalks of historic bamboo swaying gently in Arashiyama.",
                    detailedOverview = "Arashiyama Bamboo Grove is one of Kyoto's top sights—and for good reason: standing amid these soaring stalks of bamboo is like being in another world. Located in western Kyoto, the grove offers peaceful walking trails and traditional temples nearby.",
                    bestSeason = "Spring & Autumn",
                    imageResId = R.drawable.dest_kyoto
                ),
                DiscoveryItem(
                    id = 3,
                    title = "Machu Picchu Citadel",
                    location = "Cuzco Region, Peru",
                    category = "Ancient Heritage",
                    rating = "4.9",
                    shortDescription = "Iconic 15th-century Inca citadel situated high on a dramatic mountain ridge in the Andes.",
                    detailedOverview = "Machu Picchu is an Incan citadel set high in the Andes Mountains in Peru, above the Urubamba River valley. Built in the 15th century and later abandoned, it's renowned for its sophisticated dry-stone walls, dramatic peaks, and panoramic vistas.",
                    bestSeason = "April to September",
                    imageResId = R.drawable.dest_machu_picchu
                ),
                DiscoveryItem(
                    id = 4,
                    title = "Northern Lights Abisko",
                    location = "Lapland, Sweden",
                    category = "Celestial & Arctic",
                    rating = "4.9",
                    shortDescription = "Dazzling arctic auroras lighting up the polar night sky in Abisko National Park.",
                    detailedOverview = "Abisko National Park in Swedish Lapland is globally famous as one of the best locations for viewing the Aurora Borealis. Thanks to the 'blue hole' microclimate and minimal light pollution, visitors experience breathtaking celestial displays.",
                    bestSeason = "September to March",
                    imageResId = R.drawable.dest_northern_lights
                ),
                DiscoveryItem(
                    id = 5,
                    title = "Serengeti Migration",
                    location = "Mara, Tanzania",
                    category = "Wildlife & Safari",
                    rating = "4.8",
                    shortDescription = "Vast savannah plains hosting the legendary annual wildebeest and zebra wildlife migration.",
                    detailedOverview = "The Serengeti National Park is a vast ecosystem in east-central Africa. It is famed for its annual migration of over 1.5 million wildebeest and hundreds of thousands of zebras, alongside iconic big cats and sweeping acacia horizons.",
                    bestSeason = "July to October",
                    imageResId = R.drawable.dest_serengeti
                ),
                DiscoveryItem(
                    id = 6,
                    title = "Swiss Alps Panorama",
                    location = "Valais, Switzerland",
                    category = "Mountain Scenery",
                    rating = "4.9",
                    shortDescription = "Majestic snow-capped peaks, pristine alpine valleys, and world-renowned glacial vistas.",
                    detailedOverview = "The Swiss Alps form a major section of the Alps mountain range that stretches across Switzerland. Featuring iconic peaks like the Matterhorn and Eiger, the region offers breathtaking panoramic vistas, pristine lakes, and alpine wilderness.",
                    bestSeason = "June to September / Dec to March",
                    imageResId = R.drawable.dest_swiss_alps
                ),
                DiscoveryItem(
                    id = 7,
                    title = "Venice Grand Canals",
                    location = "Veneto, Italy",
                    category = "Canals & Architecture",
                    rating = "4.8",
                    shortDescription = "Romantic winding waterways, historic gothic palazzos, and graceful arched bridges.",
                    detailedOverview = "Venice, the capital of northern Italy's Veneto region, is built on more than 100 small islands in a lagoon in the Adriatic Sea. It has no roads, just canals—including the Grand Canal thoroughfare—lined with Renaissance and Gothic palaces.",
                    bestSeason = "April to June / September to October",
                    imageResId = R.drawable.dest_venice
                ),
                DiscoveryItem(
                    id = 8,
                    title = "Bali Tropical Paradise",
                    location = "Ubud, Indonesia",
                    category = "Tropical Landscape",
                    rating = "4.8",
                    shortDescription = "Emerald terraced rice paddies, ancient cliffside temples, and lush tropical jungles.",
                    detailedOverview = "Bali is an Indonesian island known for its forested volcanic mountains, iconic rice paddies, beaches and coral reefs. The island is home to religious sites such as Uluwatu Temple, perched on a cliff edge, and vibrant cultural arts in Ubud.",
                    bestSeason = "April to October",
                    imageResId = R.drawable.dest_bali
                ),
                DiscoveryItem(
                    id = 9,
                    title = "Icelandic Volcanic Wonders",
                    location = "South Iceland",
                    category = "Waterfalls & Volcanos",
                    rating = "4.9",
                    shortDescription = "Thunderous cascading waterfalls, black sand beaches, and dramatic volcanic terrain.",
                    detailedOverview = "Iceland, a Nordic island nation, is defined by its dramatic landscape with volcanoes, geysers, hot springs and lava fields. Massive glaciers are protected in Vatnajökull and Snæfellsjökull national parks, alongside roaring waterfalls like Skógafoss.",
                    bestSeason = "June to August / Sept to March",
                    imageResId = R.drawable.dest_iceland
                )
            )
        }
    }
}