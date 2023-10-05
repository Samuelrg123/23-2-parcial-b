package co.edu.unisabana.parcialarquitectura.unit.service;

import co.edu.unisabana.parcialarquitectura.repository.CheckpointDAO;
import co.edu.unisabana.parcialarquitectura.service.CheckpointService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CheckpointServiceTest {
    @Mock
    private CheckpointDAO checkpointPort;

    @InjectMocks
    CheckpointService checkpointService;
    @Test
    void checkout() {

    }
}