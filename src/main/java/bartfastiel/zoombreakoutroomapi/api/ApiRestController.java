package bartfastiel.zoombreakoutroomapi.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
class ApiRestController {

    @PostMapping(path = "/connect")
    @Operation(summary = "Connect to conference", tags = {"api"})
    @ApiResponse(
            responseCode = "200",
            description = "Successfully connected",
            content = @Content(schema = @Schema(hidden = true))
    )
    ResponseEntity<Void> connect(
    ) {
        return ResponseEntity.ok().build();
    }
}
