# Atlas Discover

**MCA Android Development - Experiment 7**  
**Project Repository:** `Android-Experiment-7-ListView-ImageView`

---

## 🎯 Aim
To create an adaptive Android application implementing a genuine Android `ListView` and `ImageView` with a custom `BaseAdapter`, ViewHolder pattern, custom row layout, explicit Intent navigation with data passing, and responsive layouts across screen sizes and orientations.

---

## 🛠️ Technologies & Architecture
- **Language:** Kotlin
- **UI Architecture:** XML Layouts, genuine Android `ListView`
- **Adapter:** Custom `BaseAdapter` with `ViewHolder` pattern for efficient view recycling
- **Navigation:** Explicit `Intent` with `Serializable` data extras (`DetailActivity`)
- **Design System:** Material 3 inspired dark editorial theme (Deep navy background `#0F172A`, warm cream typography `#FEF3C7` / `#F8FAFC`, gold accent `#F59E0B`)
- **Adaptive UI:** `layout-land` and `values-sw600dp` resource qualifiers with responsive dimensioning (`dimens.xml`)
- **System Integration:** Edge-to-edge window insets handling for status and navigation bars

---

## 🌟 Features
1. **Curated World Discoveries:** Displays nine extraordinary destinations (Santorini, Kyoto Bamboo Grove, Machu Picchu, Northern Lights Abisko, Serengeti Migration, Taj Mahal, Amalfi Coast, Grand Canyon, and Petra).
2. **Local Drawable Thumbnails:** Fully local vector graphics stored in `res/drawable/` without remote URL dependencies.
3. **Optimized ListView Custom Row:** Custom row layout (`item_discovery.xml`) with rounded card container, category badge, rating star indicator, location icon, title, and description.
4. **Detail Activity View:** Modern hero image detail screen displaying comprehensive destination overviews, best travel seasons, and smooth back navigation.
5. **Adaptive Screen Layouts:** Optimized for portrait, landscape (`layout-land`), and large screen tablets (`sw600dp`) with split-screen details in landscape mode.

---

## 📱 Project File Structure
- `MainActivity.kt` - Main discovery listing activity
- `DiscoveryAdapter.kt` - Custom `BaseAdapter` with ViewHolder pattern
- `DiscoveryItem.kt` - Serializable destination data model and 9 curated items
- `DetailActivity.kt` - Detailed view activity with rich overview and hero image
- `activity_main.xml` & `layout-land/activity_main.xml` - Adaptive main layouts
- `item_discovery.xml` - Custom ListView row card layout
- `activity_detail.xml` & `layout-land/activity_detail.xml` - Adaptive detail layouts
- `res/drawable/` - Vector graphics and icons (`img_*.xml`, `bg_*.xml`, `ic_*.xml`)
- `res/values/` - Colors, themes, strings, and responsive `dimens.xml`

---

## 🚀 Build & Run Instructions
1. Open the project in Android Studio (Jellyfish or later).
2. Sync project with Gradle files.
3. Run the app on an Android Emulator or physical device (API 24+).
4. Tap any discovery row to open its detailed overview screen. Rotate the device to test landscape adaptive layouts.
