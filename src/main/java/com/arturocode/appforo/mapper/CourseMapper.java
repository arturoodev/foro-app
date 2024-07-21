package com.arturocode.appforo.mapper;

import com.arturocode.appforo.dto.CourseDTO;
import com.arturocode.appforo.entity.Course;

public class CourseMapper {
    public static CourseDTO convertToDto(Course course) {
        return new CourseDTO(
                course.getId(),
                course.getName(),
                course.getCategory());
    }

    public static Course convertToClass(CourseDTO courseDTO) {
        return new Course(
                courseDTO.getId(),
                courseDTO.getName(),
                courseDTO.getCategory(), null);
    }
}