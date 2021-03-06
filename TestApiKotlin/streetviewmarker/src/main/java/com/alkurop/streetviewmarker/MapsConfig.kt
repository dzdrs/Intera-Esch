package com.alkurop.streetviewmarker

data class MapsConfig(
    /**
     * Camera angle for marker view. The more angle the more markers will
     * be visible horizontally.
     * Adapt it if looks like markers are not synced with cam horizontally
     */
    @JvmField val xMapCameraAngle: Double = 90.toDouble(),

    /**
     * Camera angle for marker view. The more angle the more markers will
     * be visible vertically.
     * Adapt it if looks like markers are not synced with cam vertically
     */
    @JvmField val yMapCameraAngle: Double = 100.toDouble(),


    /**
     * only markers that are 500 meters away will be shown in street view.
     */
    @JvmField val markersToShowStreetRadius: Double = 300.toDouble(),


    /**
     * markers will scale down unitl they are as far as 50 meters.
     */
    @JvmField val markerScaleRadius: Double = 50.toDouble(),


    /**
     *  if marker is closer the 10 meters user will move the camera to the marker.
     *  Otherwise click on marker will be executed
     */
    @JvmField val markerMinPositionToMoveToMarker: Double = 15.toDouble(),


    /**
     * marker will not scale down when moving away less then 40%
     */
    @JvmField val minMarkerSize: Double = 1.0,


    /**
     * marker will be shown a bit above the ground. 0 will be straight ground.
     */
    @JvmField val yOffset: Double = 0.05,

    /**
     * markers that are closer to camera will appear lower on the screen
     */
    @JvmField val lowerForCloser: Boolean = false,

    /**
     * Automatically move street view to clicked marker's location
     */
    @JvmField val navigateToLocationOnMarkerClick: Boolean = true,

    /**
     * this is here for debugging. don't touch it.
     */
    @JvmField val showIgnoringAzimuth: Boolean = false

)
