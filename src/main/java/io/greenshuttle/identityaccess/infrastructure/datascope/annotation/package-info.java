/**
 * JPA domain objects.
 */
@FilterDefs(
        value = {
                @FilterDef(
                        name = "OrganizationFilter",
                        defaultCondition = "organization_id in :organizationIds",
                        parameters = {
                                @ParamDef(
                                        name = "organizationIds",
                                        type = "set"
                                )
                        }
                ),
                @FilterDef(
                        name = "OwnerFilter",
                        defaultCondition = "create_user = :createUser",
                        parameters = {
                                @ParamDef(
                                        name = "createUser",
                                        type = "string"
                                )
                        }
                )
        }

)

package io.greenshuttle.identityaccess.infrastructure.datascope.annotation;

import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.ParamDef;