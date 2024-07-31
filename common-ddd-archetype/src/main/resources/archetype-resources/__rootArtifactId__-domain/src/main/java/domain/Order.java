#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;


import com.luban.codegen.annotation.api.GenApi;
import com.luban.codegen.annotation.app.GenApp;
import com.luban.codegen.annotation.domain.GenDomain;
import com.luban.codegen.annotation.feignservice.GenFeignService;
import com.luban.codegen.annotation.infrastructure.GenInfrastructure;
import com.luban.codegen.annotation.model.GenModel;
import com.luban.common.base.aggreateroot.AggregateRoot;
import com.luban.common.base.annotation.FieldDesc;
import com.luban.common.base.enums.ValidStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

import static ${package}.domain.OrderConstants.*;

/**
 * @author hp
 */
@GenApi(packageName = "${package}.api", sourcePath = API_SOURCE_PATH, serverName = "orderCenter")
@GenModel(packageName = "${package}.model", sourcePath = MODEL_SOURCE_PATH)
@GenApp(packageName = "${package}.app", sourcePath = APP_SOURCE_PATH)
@GenFeignService(packageName = "${package}.feignservice", sourcePath = FEIGN_SERVICE_SOURCE_PATH)
@GenDomain(packageName = "${package}.domain", sourcePath = DOMAIN_SOURCE_PATH)
@GenInfrastructure(packageName = "${package}.infrastructure", sourcePath = INFRASTRUCTURE_SOURCE_PATH, tablePrefix = "t_")
@Getter
@Setter
public class Order extends AggregateRoot<Order> {

    private Long orderId;

    @FieldDesc("状态")
    private ValidStatus status;

    public static Order create(CreateOrderContext context) {
        return null;
    }

    public void update(UpdateOrderContext context) {

    }

    public boolean enabled() {
        return Optional.ofNullable(this.status)
                .map(ValidStatus::valid)
                .orElse(false);
    }

    public boolean disabled() {
        return !enabled();
    }

    private void init() {
        setStatus(ValidStatus.VALID);
    }

    public void enable() {
        setStatus(ValidStatus.VALID);
    }

    public void disable() {
        setStatus(ValidStatus.INVALID);
    }

}
