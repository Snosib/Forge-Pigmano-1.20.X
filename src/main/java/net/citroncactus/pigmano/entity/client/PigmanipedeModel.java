package net.citroncactus.pigmano.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.citroncactus.pigmano.entity.animations.ModAnimationDefinitions;
import net.citroncactus.pigmano.entity.custom.PigmanipedeEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class PigmanipedeModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart pigmanipede;

	public PigmanipedeModel(ModelPart root) {

		this.pigmanipede = root.getChild("pigmanipede");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pigmanipede = partdefinition.addOrReplaceChild("pigmanipede", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = pigmanipede.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 30).addBox(-7.0F, -5.0F, -4.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 50).addBox(0.0F, 1.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 50).addBox(-5.0F, 1.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -11.0F, -8.0F));

		PartDefinition left_ear_r1 = head.addOrReplaceChild("left_ear_r1", CubeListBuilder.create().texOffs(0, 0).addBox(2.8785F, -2.9302F, -7.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 5.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(9.5F, -19.0F, 0.0F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.5F, -19.0F, 0.0F));

		PartDefinition body = pigmanipede.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 32).addBox(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 3.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-11.0F, -13.0F, -3.0F, 8.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 8.0F, -11.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition group2 = pigmanipede.addOrReplaceChild("group2", CubeListBuilder.create().texOffs(49, 18).addBox(-9.85F, 5.2F, 2.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r1 = group2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 47).addBox(-0.5188F, 0.0146F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 27).addBox(-1.0188F, 6.1278F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -3.0F, 3.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = group2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 46).addBox(-7.3275F, -0.037F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 15).addBox(-5.3275F, 0.463F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.0F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r3 = group2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 12).addBox(-0.9289F, -1.4142F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition group5 = pigmanipede.addOrReplaceChild("group5", CubeListBuilder.create().texOffs(48, 45).addBox(10.85F, 5.2F, 2.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r4 = group5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 23).addBox(1.1716F, 8.4853F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r5 = group5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(32, 46).addBox(-0.4812F, 0.0146F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 46).addBox(-0.9812F, 6.1278F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -3.0F, 2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r6 = group5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 46).addBox(6.6341F, -0.5782F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 8).addBox(-1.3659F, -0.0782F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group8 = pigmanipede.addOrReplaceChild("group8", CubeListBuilder.create().texOffs(8, 50).addBox(-9.85F, 5.2F, -3.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r7 = group8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 25).addBox(0.4853F, -1.4142F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 3.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r8 = group8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 0).addBox(-0.7535F, 0.8624F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 39).addBox(-1.2535F, 7.3624F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -5.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r9 = group8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 35).addBox(-0.3296F, -1.0203F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -5.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r10 = group8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 17).addBox(-6.9448F, -0.6132F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group11 = pigmanipede.addOrReplaceChild("group11", CubeListBuilder.create().texOffs(24, 50).addBox(7.85F, 5.2F, 0.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -8.0F, -3.0F));

		PartDefinition cube_r11 = group11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 43).addBox(-3.7782F, -0.7071F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r12 = group11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(4, 50).addBox(-0.2465F, 0.8624F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 48).addBox(-0.7465F, 7.3624F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r13 = group11.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 50).addBox(5.9448F, -1.1132F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 19).addBox(-1.0552F, -0.6132F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group14 = pigmanipede.addOrReplaceChild("group14", CubeListBuilder.create().texOffs(0, 0).addBox(10.85F, 5.2F, 7.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r14 = group14.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 9).addBox(-3.7782F, -0.7071F, 0.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 3.0F, 7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r15 = group14.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(44, 38).addBox(-0.4812F, 0.0146F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 21).addBox(-0.9812F, 6.1278F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -3.0F, 7.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r16 = group14.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 34).addBox(5.7102F, -0.9609F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 0).addBox(-2.2898F, -0.4609F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 0.0F, 7.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group17 = pigmanipede.addOrReplaceChild("group17", CubeListBuilder.create().texOffs(6, 0).addBox(-9.85F, 5.2F, 7.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r17 = group17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 24).addBox(-0.2218F, -0.7071F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 3.0F, 8.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r18 = group17.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 0).addBox(-7.2102F, -0.4609F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 25).addBox(-7.7102F, 5.6522F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 10).addBox(-7.7102F, -0.9609F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 2).addBox(-5.7102F, -0.4609F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group20 = pigmanipede.addOrReplaceChild("group20", CubeListBuilder.create().texOffs(28, 30).addBox(6.85F, 5.2F, 0.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -8.0F, 12.0F));

		PartDefinition cube_r19 = group20.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(44, 14).addBox(-3.7782F, -0.7071F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 3.0F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r20 = group20.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 46).addBox(-0.2465F, 0.8624F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 8).addBox(-0.7465F, 7.3624F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -5.0F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r21 = group20.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(43, 19).addBox(5.9448F, -1.1132F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 4).addBox(-1.0552F, -0.6132F, 0.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition group23 = pigmanipede.addOrReplaceChild("group23", CubeListBuilder.create().texOffs(35, 31).addBox(-9.85F, 5.2F, 12.0F, 1.0F, 2.8F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition cube_r22 = group23.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 16).addBox(-0.2218F, -0.7071F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, 3.0F, 13.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r23 = group23.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 46).addBox(-0.7535F, 0.8624F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 46).addBox(-1.2535F, 7.3624F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -5.0F, 12.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r24 = group23.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 31).addBox(-8.8687F, -0.7305F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(27, 6).addBox(-7.8687F, -0.2305F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.0F, 13.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition group26 = pigmanipede.addOrReplaceChild("group26", CubeListBuilder.create(), PartPose.offset(4.0F, -11.0F, 17.0F));

		PartDefinition cube_r25 = group26.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 38).addBox(0.0F, -11.0F, 3.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r26 = group26.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(35, 25).addBox(0.0F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition group = pigmanipede.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(-1.0F, -11.0F, 16.0F));

		PartDefinition cube_r27 = group.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(36, 38).addBox(0.0F, -11.0F, 3.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r28 = group.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(28, 30).addBox(0.0F, -0.3F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body2 = pigmanipede.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition body5_r1 = body2.addOrReplaceChild("body5_r1", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -4.2472F, 6.8666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(0.0F, -4.2472F, 0.8666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(27, 21).addBox(0.0F, -4.2472F, 4.8666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(32, 22).addBox(-1.0F, -4.2472F, 2.8666F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(5, 20).addBox(-1.0F, -4.2472F, -0.1334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.2472F, -0.1334F, 8.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, 7.0F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDefinitions.PIGMANIPEDE_WALK, limbSwing, limbSwingAmount, 4f, 2.5f);
		this.animate(((PigmanipedeEntity) entity).idleAnimationsState, ModAnimationDefinitions. PIGMANIPEDE_IDLE, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		pigmanipede.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return pigmanipede;
	}
}