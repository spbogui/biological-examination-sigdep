package org.openmrs.module.biologicalexam.extension.html;
import org.openmrs.api.context.Context;
import org.openmrs.module.web.extension.LinkExt;

public class BiologicalExamGutterLink extends LinkExt {
    @Override
    public String getLabel() {
        return Context.getMessageSourceService().getMessage("Examen biologique CV");
    }

    @Override
    public String getUrl() {
        return "module/biologicalexam/manage.form";
    }

    @Override
    public String getRequiredPrivilege() {
        return "Manage Biological Exam";
    }
}
