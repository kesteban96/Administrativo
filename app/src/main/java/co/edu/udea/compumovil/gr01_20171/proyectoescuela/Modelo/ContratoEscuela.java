package co.edu.udea.compumovil.gr01_20171.proyectoescuela.Modelo;

import java.util.UUID;

/**
 * Created by Alejandro on 27/02/2017.
 */

public class ContratoEscuela {

    interface ColumnasEstudiante{
        String EST_IDENTIFICACION = "est_identificacion";
        String EST_NOMBRES = "est_nombres";
        String EST_APELLIDOS = "est_apellidos";
        String EST_FOTO = "est_foto";
        String EST_GRP_ID = "est_grp_id";
        String EST_POS_COL = "est_pos_col";
        String EST_POS_FILA = "est_pos_fila";
    }

    interface ColumnasGrupo{
        String GRP_NOMBRE = "grp_nombre";
        String GRP_GRADO = "grp_grado";
    }

    interface ColumnasMaterias{
        String MTA_ID = "mta_id";
        String MTA_NOMBRE = "mta_nombre";
    }

    interface ColumnasMateriasEstudiantes{
        String MEST_MTA_ID = "mest_mta_id";
        String MEST_EST_ID = "mest_est_id";
    }

    interface ColumnasAsistencia{
        String AST_ASISTENCIA = "ast_asistencia";
        String AST_FECHA = "ast_fecha";
        String AST_EST_ID = "ast_est_id";
    }

    interface ColumnasSeguimiento{
        String SEG_ID = "seg_id";
        String SEG_SUBC_ID = "seg_subc_id";
        String SEG_EST_ID = "seg_est_id";
        String SEG_ESTADO = "seg_estado";
        String SEG_FECHA = "seg_fecha";
        String SEG_TIPO = "seg_tipo";
    }

    interface ColumnasSubcategorias{
        String SUBC_ID = "subc_id";
        String SUBC_CAT_ID = "subc_cat_id";
        String SUBC_NOMBRE = "subc_nombre";
        String SUBC_ICONO = "subc_icono";
    }

    interface ColumnasCategorias{
        String CAT_ID = "cat_id";
        String CAT_NOMBRE = "cat_nombre";
    }

    interface ColumnasMetas{
        String MET_ID = "met_id";
        String MET_LISTMET_ID = "met_listmet_id";
        String MET_ID_GPEST_ID = "met_id_gpest_id";
        String MET_FECHA_INICIO = "met_fecha_inicio";
        String MET_FECHA_CUMPLIMIENTO = "met_fecha_cumplimiento";
        String MET_DURACION = "met_duracion";
        String MET_ESTADO = "met_estado";
    }

    interface ColumnasGrupoEstudiantes{
        String GPEST_ID = "gpest_id";
        String GPEST_EST_IDENTIFICACION = "gpest_est_identificacion";
    }

    interface ColumnasListaMetas{
        String LISTMET_ID = "listmet_id";
        String LISTMET_NOMBRE = "listmet_nombre";
    }

    interface ColumnasListaGrupoEstudiantes{
        String GPLISTEST_GPEST_ID = "gplistest_gpest_id";
        String GPELISTEST_EST_IDENTIFICACION = "gplistest_est_identificacion";
    }


    public static class Estudiante implements ColumnasEstudiante{
        public static String generarIdentificacionEstudiante(){
            return "EST-" + UUID.randomUUID().toString();
        }
    }

    public static class Grupo implements ColumnasGrupo{
        public static String generarIdGrupo(){
            return "GRP"+ UUID.randomUUID().toString();
        }
    }

    public static class Materias implements ColumnasMaterias{
        public static String generarIdMaterias(){
            return "MTA"+ UUID.randomUUID().toString();
        }
    }

    public static class MateriaEstudiante implements ColumnasMateriasEstudiantes{
        public static String generarIdMateriaEstudiante(){
            return "MEST"+ UUID.randomUUID().toString();
        }
    }

    public static class Asistencia implements ColumnasAsistencia{
        public static String generarIdAsistencia(){
            return "AST-" + UUID.randomUUID().toString();
        }
    }

    public static class Seguimiento implements ColumnasSeguimiento{
        public static String generarIdSeguimiento(){
            return "SEG-" + UUID.randomUUID().toString();
        }
    }

    public static class Subcategorias implements ColumnasSubcategorias{
        public static String generarIdSubcategorias(){
            return "SUBC-" + UUID.randomUUID().toString();
        }
    }

    public static class Metas implements ColumnasMetas{
        public static String generarIdMetas(){
            return "MET-" + UUID.randomUUID().toString();
        }
    }

    public static class ListaMetas implements ColumnasListaMetas{
        public static String generarIdListaMetas(){
            return "LISTMET-" + UUID.randomUUID().toString();
        }
    }

    public static class GrupoEstudiantes implements ColumnasGrupoEstudiantes{
        public static String generarIdGrupoEstudiantes(){
            return "GPEST-" + UUID.randomUUID().toString();
        }
    }

    public static class Categorias implements ColumnasCategorias{
        public static String generarIdCategorias(){
            return "CAT-" + UUID.randomUUID().toString();
        }
    }

    public static class ListaGrupoEstudiantes implements ColumnasListaGrupoEstudiantes{
        public static String generarIdCategorias(){
            return "GPLISTEST-" + UUID.randomUUID().toString();
        }
    }

    private ContratoEscuela(){}


}
