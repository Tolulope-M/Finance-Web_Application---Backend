package com.decagon.reward_your_teacher.infrastructure.persistence.daoImpl;

import com.decagon.reward_your_teacher.domain.dao.NotificationDao;
import com.decagon.reward_your_teacher.domain.entities.StudentEntity;
import com.decagon.reward_your_teacher.domain.entities.TeacherEntity;
import com.decagon.reward_your_teacher.domain.entities.message.NotificationEntity;
import com.decagon.reward_your_teacher.domain.entities.transact.TransactionEntity;
import com.decagon.reward_your_teacher.infrastructure.persistence.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotificationDaoImpl extends CrudDaoImpl<NotificationEntity, Long> implements NotificationDao {
    private final NotificationRepository notificationRepository;

    protected NotificationDaoImpl(NotificationRepository notificationRepository) {
        super(notificationRepository);
        this.notificationRepository = notificationRepository;
    }

    @Override
    public List<NotificationEntity> findNotificationEntitiesByStudent(StudentEntity student) {
        return notificationRepository.findNotificationEntitiesByStudent(student);
    }

    @Override
    public List<NotificationEntity> findNotificationEntitiesByTeacher(TeacherEntity teacher) {
        return notificationRepository.findNotificationEntitiesByTeacher(teacher);
    }

    @Override
    public NotificationEntity findNotificationEntityByTeacherAndStudent(TeacherEntity teacher, StudentEntity student) {
     return notificationRepository.findNotificationEntityByTeacherAndStudent(teacher, student);
    }

    @Override
    public NotificationEntity findNotificationEntityByTransaction(TransactionEntity transaction) {
        return notificationRepository.findNotificationEntityByTransaction(transaction);
    }

}
