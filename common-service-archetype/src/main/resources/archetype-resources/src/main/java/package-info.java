#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
@QueryEntities(value = {BaseJpaAggregate.class})
package ${package};

import com.luban.jpa.BaseJpaAggregate;
import com.querydsl.core.annotations.QueryEntities;