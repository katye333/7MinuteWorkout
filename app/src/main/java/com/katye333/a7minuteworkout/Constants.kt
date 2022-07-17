package com.katye333.a7minuteworkout

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()

        val abdominalCrunch = ExerciseModel(1, "Abdominal Crunches", R.drawable.ic_abdominal_crunch, false, false)
        val highKnees = ExerciseModel(2, "High Knees Running in place", R.drawable.ic_high_knees_running_in_place, false, false)
        val jumpingJacks = ExerciseModel(3, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false)
        val lunges = ExerciseModel(4, "Lunges", R.drawable.ic_lunge, false, false)
        val planks = ExerciseModel(5, "Planks", R.drawable.ic_plank, false, false)
        val pushUps = ExerciseModel(6, "Push Ups", R.drawable.ic_push_up, false, false)
        val pushUpsAndRotation = ExerciseModel(7, "Push Ups and Rotation", R.drawable.ic_push_up_and_rotation, false, false)
        val sidePlanks = ExerciseModel(8, "Side Planks", R.drawable.ic_side_plank, false, false)
        val squats = ExerciseModel(9, "Squats", R.drawable.ic_squat, false, false)
        val stepUps = ExerciseModel(10, "Step-up onto chair", R.drawable.ic_step_up_onto_chair, false, false)
        val tricepsDips = ExerciseModel(11, "Triceps Dip on chair", R.drawable.ic_triceps_dip_on_chair, false, false)
        val wallSits = ExerciseModel(12, "Wall Sits", R.drawable.ic_wall_sit, false, false)

        exerciseList.add(abdominalCrunch)
        exerciseList.add(highKnees)
        exerciseList.add(jumpingJacks)
        exerciseList.add(lunges)
        exerciseList.add(planks)
        exerciseList.add(pushUps)
        exerciseList.add(pushUpsAndRotation)
        exerciseList.add(sidePlanks)
        exerciseList.add(squats)
        exerciseList.add(stepUps)
        exerciseList.add(tricepsDips)
        exerciseList.add(wallSits)
        return exerciseList
    }
}