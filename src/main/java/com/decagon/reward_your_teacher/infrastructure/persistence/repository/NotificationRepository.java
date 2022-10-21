package com.decagon.reward_your_teacher.infrastructure.persistence.repository;

import com.decagon.reward_your_teacher.domain.entities.StudentEntity;
import com.decagon.reward_your_teacher.domain.entities.TeacherEntity;
import com.decagon.reward_your_teacher.domain.entities.message.NotificationEntity;
import com.decagon.reward_your_teacher.domain.entities.transact.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Long> {

    List<NotificationEntity> findNotificationEntitiesByStudent(StudentEntity student);

    List<NotificationEntity> findNotificationEntitiesByTeacher(TeacherEntity teacher);
    NotificationEntity findNotificationEntityByTeacherAndStudent(TeacherEntity teacher, StudentEntity student);
    NotificationEntity findNotificationEntityByTransaction(TransactionEntity transaction);
}
